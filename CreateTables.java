import java.sql.Connection;
import java.sql.Statement;

public class CreateTables {
	
	private static String tables = "CREATE TABLE Classroom(\r\n" + 
			"  max_people INT NOT NULL,\r\n" + 
			"  room_number INT NOT NULL,\r\n" + 
			"  building TEXT NOT NULL,\r\n" + 
			"  type_of_classroom text NOT NULL,\r\n" + 
			"  isReserved BOOLEAN NOT NULL,\r\n" + 
			"  building_address text NOT NULL,\r\n" + 
			"  PRIMARY KEY (room_number),\r\n" + 
			"  UNIQUE (building)\r\n" + 
			");\r\n" + 
			"\r\n" + 
			"CREATE TABLE Users(\r\n" + 
			"  email text NOT NULL,\r\n" + 
			"  first_name text NOT NULL,\r\n" + 
			"  last_name text NOT NULL,\r\n" + 
			"  user_address text,\r\n" + 
			"  PRIMARY KEY (email)\r\n" + 
			");\r\n" + 
			"\r\n" + 
			"CREATE TABLE Admins(\r\n" + 
			"  email text NOT NULL,\r\n" + 
			"  first_name text NOT NULL,\r\n" + 
			"  last_name text NOT NULL,\r\n" + 
			"  permissions text NOT NULL,\r\n" + 
			"  PRIMARY KEY (email),\r\n" + 
			"  UNIQUE (permissions)\r\n" + 
			");"+"CREATE TABLE Reservation(\r\n" + 
					"  r_number INT NOT NULL,\r\n" + 
					"  amount_of_people INT NOT NULL,\r\n" + 
					"  time INT NOT NULL,\r\n" + 
					"  PRIMARY KEY (r_number)\r\n" + 
					");";
	
	public static void main(String[] args) {
		
		Connection c = null;
		Statement stat = null;
		ConnectDB c_db1 = new ConnectDB();
		
		c = c_db1.get_connection();
		
		try {
			
			String query = tables;
			stat = c.createStatement();
			stat.executeUpdate(query);
			System.out.println("Created Tables.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
