package JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {
	@Test
	public void executeUpdateTest() throws SQLException
	{
		//step1 Register the driver
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
		//step2 connect to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		
		 //step3 createStatement
		Statement stmt=con.createStatement();
		
		//step4 execute update
		int result=stmt.executeUpdate("insert into students_info(regno,firstname,middlename,lastname) values('4','bharat','teja','v')");
	if(result==1)
	{
	System.out.println("ExecuteUpadate Pass");	
	}
	else
	{
		System.out.println("ExecuteUpadate fail");	
	}
	
	//step5 close the connection
	con.close();
	}

}
