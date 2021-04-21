package com.ipro1.springboot;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {
	public static void main(String[] args) throws SQLException
	{
		Connection connection  = null;
		Statement statemnt = null;
		
		ConnectDB obj_ConnectDB = new ConnectDB();
		
		connection = obj_ConnectDB.get_connection();

		try {
			
			String query = "create table classroom(max_people INT NOT NULL, room_number INT NOT NULL, building varchar(20) NOT NULL, type_of_classroom varchar(20) NOT NULL, building_address varchar(48) NOT NULL, PRIMARY KEY(room_number))";
			statemnt = connection.createStatement();
			statemnt.executeUpdate(query);
			System.out.print("Finished");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
