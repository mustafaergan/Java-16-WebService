package com.vektorel.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/hello")
public class HelloWorld {

//	@GET
//	@Path("{param}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String deneme(@PathParam("param") String msg){
//		Person person = new Person();
//		person.setName("Mustafa");
//		Gson gson = new Gson();
//		String json = gson.toJson(person);
//		String xml = "<my><name>"+person.getName() + "</name></my>";
//		return json;
//	}
	
//	@GET
//	@Path("/myparam/{par1}/{par2}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String deneme2(@PathParam("par1") String par1, @PathParam("par2") String par2){
//		Person person = new Person();
//		person.setId(par1);
//		person.setName(par2);
//		Gson gson = new Gson();
//		String json = gson.toJson(person);
//		return json;
//		
//	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public String deneme3(@QueryParam("isim") String mustafa){
		return mustafa;
	}
	
	@GET
	@Path("/query2")
	@Produces(MediaType.APPLICATION_JSON)
	public String deneme3(@QueryParam("isim") String name,@QueryParam("soyad") String soyad){
		return name+" "+soyad;
	}
	
	@POST
	@Path("/postdeneme")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String deneme4(@FormParam("isim") String isim, @FormParam("soyad") String soyad ){
		return isim+" "+soyad;
	}
	
	@PUT
	@Path("/putdeneme")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String deneme5(@FormParam("isim") String isim ){
		return isim+" ";
	}
	
	@DELETE
	@Path("/deleteDeneme/{param1}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deneme6(@PathParam("param1") int id ){
		return id + "kayýt silindi";
		
	}
	
	
	
	
}
