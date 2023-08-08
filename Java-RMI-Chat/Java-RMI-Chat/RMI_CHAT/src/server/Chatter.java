package server;

import client.ChatClient3IF;



public class Chatter {

	public String name;
	public ChatClient3IF client;
	
	//constructor
	public Chatter(String name, ChatClient3IF client){
		this.name = name;
		this.client = client;
	}

	
	//getters and setters
	public String getName(){
		return name;
	}
	public ChatClient3IF getClient(){
		return client;
	}
	
	
}
