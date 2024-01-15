package com.osc.websocket.test;

public class KafkaProducer {

//	public static String ProduceInTopic(String key,Map<String, String> valueMap) {
//
//		String bootstrapServers = "localhost:9092";
//
//		String topic = "session-stream-topic";
//
//		Properties properties = new Properties();
//		properties.setProperty("bootstrap.servers", bootstrapServers);
//		properties.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//		properties.setProperty("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//		Producer<String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer<>(properties);
//
//		try {
//			ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, new ObjectMapper().writeValueAsString(valueMap));
//
//			producer.send(record);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			producer.close();
//		}
//
//		return "User Logout";
//	}

}
