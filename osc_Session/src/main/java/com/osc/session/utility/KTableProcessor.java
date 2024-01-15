package com.osc.session.utility;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.stereotype.Component;


@Component
public class KTableProcessor {
	/*
 
 //KTABLE STATE: Create a KTable for State of sales per dealer
 public void process(KStream<String, String> stream){ 
	 
	  KTable<String, String> sessionTable = stream
	 .groupByKey()   // DSL (Domain Specific Lang)
     .reduce((oldValue, newValue) -> newValue, Materialized.as("user-session-store"));
	  
	  sessionTable.toStream().foreach((x,y)-> System.out.println("key : "+x+" Value : "+y));
	 
	 }
	 */
}