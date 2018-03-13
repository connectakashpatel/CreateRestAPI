package com.akash.api.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.akash.api.Model.Person;

@Path("/a")
public class PersonCtrl {

	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Person showPerson() {
		
		Person p = new Person();
		
		p.setId(1);
		p.setName("Akash");
		
		return p;
	}
	
}
