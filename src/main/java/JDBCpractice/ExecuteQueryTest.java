package JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest {
	@Test
	public void executequeryTest() throws SQLException {
		
		Connection con=null;
		try {
			//step1 Register the driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			//step2 connect to the database
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
			 //step3 createStatement
			Statement stmt=con.createStatement();
			
			//step4 execute query
			ResultSet result=stmt.executeQuery("select * from students_info");
			while(result.next())
			{
				System.out.println(result.getString(1)+""+result.getString(2)+""+result.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//step5 close the connection
		finally
		{
			con.close();
		}
	}
	

}
