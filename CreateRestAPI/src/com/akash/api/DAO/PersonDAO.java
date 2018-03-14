package com.akash.api.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import com.akash.api.Util.ResultSetConverter;

public class PersonDAO {

	public Connection connectDB() {

		Connection c = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "root");

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

		c = connectDB();

		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next())
				personList.add(rs.getString("name"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (c != null)
				c.close();
		}

		return personList;

	}

	public String showAllJson() throws SQLException {

		Connection c = null;
		PreparedStatement ps = null;
		JSONArray jsonArray = new JSONArray();
		

		String jsonList = null;
		String sql = "SELECT * FROM person";

		c = connectDB();

		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			jsonArray = ResultSetConverter.convert(rs);
			
			jsonList = jsonArray.toString();

		} catch (SQLException | JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (c != null)
				c.close();
		}

		return jsonList;

	}

}
