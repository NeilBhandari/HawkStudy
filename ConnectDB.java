package com.ipro1.springboot;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public static void main (String[] args)
	{
		ConnectDB obj_ConnectDB = new ConnectDB();
		
		System.out.println(obj_ConnectDB.get_connection());
		
	}
	
	public Connection get_connection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentschema=public", "postgres", "753113");
			if (connection != null)
			{
				System.out.println("Connection Status: Success");
				System.out.println(connection.getSchema());
			}
			else
			{
				System.out.println("Connection Status: Failed");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
