import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDemo {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhurandhar","root","root");
			
			DatabaseMetaData dmt = cn.getMetaData();
			
			System.out.println(dmt.getDriverName());
			System.out.println(dmt.getDatabaseMajorVersion());
			
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from library");
			
			ResultSetMetaData rmt = rs.getMetaData();
			
			System.out.println(rmt.getColumnCount());
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
