import java.sql.Connection;
import java.sql.Statement;

public class Insert_Values {

	public static void main(String[] args) {
		Connection c = null;
		Statement stat = null;
		ConnectDB c_db1 = new ConnectDB();
		
		c = c_db1.get_connection();
		
		try {
			
			String query = "INSERT INTO classroom (max_people,room_number,building,type_of_classroom,isreserved,building_address) VALUES (\r\n" + 
					"  '5',\r\n" + 
					"  '101',\r\n" + 
					"  'building 0',\r\n" + 
					"  'food allowed, groups allowed',\r\n" + 
					"  'false',\r\n" + 
					"  'address of building 0'\r\n" + 
					");";
			stat = c.createStatement();
			stat.executeUpdate(query);
			System.out.println("Inserted Values.");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
