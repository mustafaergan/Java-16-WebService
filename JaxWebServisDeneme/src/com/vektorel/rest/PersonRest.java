package com.vektorel.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonRest {
	
	Map<String,Person> person = new HashMap<String,Person>();
	
	//DAO dao;
	
	@GET
	@Path("{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPerson(@PathParam("param") String id){
		person.put("1", new Person("1", "ahmet"));
		Person entity = person.get(id);
		Gson son = new Gson();
		return son.toJson(entity);
	}
	
	@PUT
	@Path("/insert")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response insertPerson(@FormParam("id") String id, @FormParam("name") String name){
		person.put(id, new Person(id, name));
		return Response.ok().build();
		
	}
	
	@DELETE
	@Path("/delete/{param}")
	public Response deletePerson(@PathParam("param") String id){
		person.remove(id);
		return Response.ok().build();
	}

}
