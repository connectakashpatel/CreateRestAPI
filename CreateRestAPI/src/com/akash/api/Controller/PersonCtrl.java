package com.akash.api.Controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.akash.api.DAO.PersonDAO;
import com.akash.api.Model.Person;

@Path("/person")
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
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List all() throws SQLException {
		
		PersonDAO dao = new PersonDAO();
	
		return dao.showAll();
	}
	
	@GET
	@Path("/alljson")
	@Produces(MediaType.APPLICATION_JSON)
	public String allJson() throws SQLException {
		
		PersonDAO dao = new PersonDAO();
	
		return dao.showAllJson();
	}
}
