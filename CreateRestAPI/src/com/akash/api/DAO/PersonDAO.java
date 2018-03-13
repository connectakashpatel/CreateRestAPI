package com.akash.api.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	
	
	public Connection connectDB() {
		
		Connection c = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c;
		
	}
	
	public List showAll() throws SQLException {
		
		Connection c = null;
		PreparedStatement ps = null;
		
		List<String> personList = new ArrayList<String>();
		String sql = "SELECT * FROM person";
		
		c= connectDB();
		
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				personList.add(rs.getString("name"));
				
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			c.close();
		}
		
		return personList;
		
	}

}
