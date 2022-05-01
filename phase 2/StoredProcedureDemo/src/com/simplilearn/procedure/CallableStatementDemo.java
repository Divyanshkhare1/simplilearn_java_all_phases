package com.simplilearn.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Connection conn	 = DBUtil.getDBConnection();
		
	try {
		CallableStatement cstmt =  conn.prepareCall("{call EMP_PRO(?,?,?)}");
	
				cstmt.setInt(1, 120);
				cstmt.setString(2, "Chika");
				cstmt.setInt(3, 45600);
				
				cstmt.execute(); //to execute givenprocedure
				
				System.out.println("Stored procedure called");
				
				
				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
