package com.osc.websocket.actors;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.osc.websocket.service.WebSocketService;

import akka.actor.AbstractActor;
import akka.actor.Props;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ClientConnectionActor extends AbstractActor {

	private List<String> userSocketDetailList;

	public ClientConnectionActor(List<String> userSocketDetailList) {
		this.userSocketDetailList = userSocketDetailList;
	}


	public static Props props(List<String>userSocketKey) {
		return Props.create(ClientConnectionActor.class,()->new ClientConnectionActor(userSocketKey));
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder().
				//need  Object To get websocket connection for storing
				match(ArrayList.class, this :: readMesssage)
				.build();
	}

	private void readMesssage(List<String> userSocketDetailList) {
		try {
			String  userSocketDetails = new ObjectMapper().writeValueAsString(userSocketDetailList);

			new WebSocketService().storeInCache(userSocketDetails); 
			
			System.out.println("=============websocket Details sent to cache service for storing===================");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
