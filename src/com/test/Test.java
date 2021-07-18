package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Test {
	
	// get, post	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getHelloWorld")
	public List<String> getHelloWorld(){
		List<String> list = new ArrayList<>();
		list.add("Ayoob");
		list.add("Turab");
		list.add("JK");
		list.add("Naresh");
		return list;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getById/{id}")
	public String getById(@PathParam("id") Long id){
		if(id==1){
			return "I am record of ID 1";
		}
		else if(id==2){
			return "I am record of ID 2";
		}
		else if(id==3){
			return "I am record of ID 3";
		}
		else{
			return "I am else";
		}
		
	}

}
