package com.simplilearn.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//step1 Register Driver
		
		try {
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//step 2 get DB connection
			
	Connection conn =		DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis", "root", "Divyansh1!");
			
       // Step 3 create any one statement
	
//		a.statement
//		b.prepared statement
//		c.callable statement
	
		
	Statement stmt = conn.createStatement();//use statement for static queries
	
	
		String query = "insert into employee values(105,'dkhare',current_date,500)";
//		
		// Step4 write query and execute it 
		
			int	count =	stmt.executeUpdate(query);					
		
				System.out.println(count + "records inserted succesfully...");
//		
				 query = "Select * from employee"; // static query
	
	ResultSet rs =			stmt.executeQuery(query);
	
	while(rs.next()) {
		
	int eid = 	rs.getInt("eid");
	String ename = 	rs.getString("ename");
	int salary = rs.getInt(4);	
	
	System.out.println(eid + " " + ename + " "+ salary + " "+ rs.getDate("doj"));
	
	
	}
	
	
				//Step-5
				conn.close();
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
