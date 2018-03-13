package com.akash.api.Test;

import java.sql.Connection;

import com.akash.api.DAO.PersonDAO;

public class TestingClass {

	public static void main(String[] args) {


		PersonDAO dao = new PersonDAO();
		
		Connection c = dao.connectDB();

	}

}
