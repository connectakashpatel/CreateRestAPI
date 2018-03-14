package com.akash.api.Controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.akash.api.DAO.PersonDAO;
import com.akash.api.Model.Person;

@Path("/person")
public class PersonGetCtrl {

	
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
	
	@GET
	@Path("/queryparam")
	@Produces(MediaType.APPLICATION_JSON)
	public String getQueryResult(@QueryParam("search_name") String name) throws SQLException {
		
		PersonDAO dao = new PersonDAO();
		return dao.getUser(name);
	}
	
	@GET
	@Path("/pathparam/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPathResult(@PathParam("name") String name) throws SQLException {
		
		PersonDAO dao = new PersonDAO();
		return dao.getUser(name);
	}
	
	@GET
	@Path("/matrixparam")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMarrixResult(@MatrixParam("name") String name) throws SQLException {
		
		PersonDAO dao = new PersonDAO();
		return dao.getUser(name);
	}
}
