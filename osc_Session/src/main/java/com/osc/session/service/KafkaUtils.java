package com.osc.session.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaUtils {
	private final KafkaStreams streams;
	public ReadOnlyKeyValueStore<String, String> userSessionStore;

	public KafkaUtils() {

		Properties props = new Properties();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "ktable");
		props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

		StreamsBuilder builder = new StreamsBuilder();
		KStream<String, String> userSessionsStream = builder.stream("session-stream-topic", Consumed.with(Serdes.String(), Serdes.String()));
		
		userSessionsStream.foreach((key, value) -> System.out.println("==Key:== " + key + ",== Value:== " + value));
		
		//The state store named "user-session-store" is created using the reduce aggregation.
		KTable<String, String> sessionTable = userSessionsStream
				.groupByKey()   // DSL (Domain Specific Lang)
				.reduce((oldValue, newValue) -> newValue, Materialized.as("user-session-store"));

		streams = new KafkaStreams(builder.build(), props);
		
		streams.setStateListener((newState, oldState) -> {
			if (newState == KafkaStreams.State.RUNNING && oldState == KafkaStreams.State.REBALANCING) {
				//KafkaStreams instance, the "store" method is used to get access to the state store "user-session-store"
				userSessionStore = streams.store(StoreQueryParameters.fromNameAndType("user-session-store", QueryableStoreTypes.keyValueStore()));
			}
		});


		streams.start();
	}

	public void close() {

		if (streams != null) {
			streams.close();
		}
	}

	public boolean  getSessionStatus(String userId, String device) throws JsonProcessingException {
		String key = userId + "_" + device;
		while (userSessionStore == null) {
			try {
				Thread.sleep(100); // Sleep for a short time before checking again
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		//The get method of ReadOnlyKeyValueStore is used to query the ktable for a specific record interactively.
		String sessionData = userSessionStore.get(key);
		
		if(sessionData!= null) {
			Map<String, String> sessionDataMap = new ObjectMapper().readValue(sessionData, HashMap.class);
			return sessionDataMap.get("login").equals("true") ? true : false;
		}

		return false;

	}

}
