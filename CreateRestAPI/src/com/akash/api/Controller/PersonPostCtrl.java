package com.akash.api.Controller;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.ObjectMapper;

@Path("/personpost")
public class PersonPostCtrl {
	
	@POST
	@Path("/post")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED})
	@Produces(MediaType.TEXT_HTML)
	public void addUser(String data) {
		
		
		System.out.println("Data: "+data);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			PersonMapper personMapper = mapper.readValue(data, PersonMapper.class);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

class PersonMapper{
	
	public int id;
	public String name;
	
}