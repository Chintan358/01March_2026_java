import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallbleDemo {
	public static void main(String[] args) {     
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
			
			CallableStatement cb = cn.prepareCall("call allbook()");
			ResultSet rs = cb.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
				
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
