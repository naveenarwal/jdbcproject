package com.myapp;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbcon1 {

		
		private static final String DB_DRIVER="com.mysql.cj.jdbc.Driver";
		private static final String DB_USER="root";
		private static final String DB_PSW="";
		private static final String DB_URL="jdbc:mysql://localhost:3306/jdbcdemo1";
    	private static final String INSERT_employee="INSERT INTO `employee`(`Ename`, `Esalary`) VALUES ('Vijay Singh','15000')";
    //	private static final String UPDATE_employee="UPDATE `employee` SET `Ename`='mohan',`Esalary`='20000' WHERE 1";
	//  private static final String SELECT_employee="SELECT * FROM `employee`";
	//	private static final String DELETE_employee="DELETE FROM `employee` WHERE 'eid'=4";

		public static void main(String[] args)throws Exception
		{
			//load driver class
			
			Class.forName(DB_DRIVER);
			
			//get connection
			
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PSW);
			//create statement
			
			Statement stmt=con.createStatement();
			/*
			 *DDL
			 *DML sql=INSERT INTO 'employee' ="INSERT INTO `employee`( `ename`, `esalary`) VALUES ('Name','20000')";
			 *
			 * */

			int affectedRows=stmt.executeUpdate(INSERT_employee);
			System.out.println(affectedRows+"Row Updated");
	        con.close();
	        
	     //   ResultSet rs=stmt.executeQuery(SELECT_EMPLOYEE);
	    //    System.out.print(String.format("%5s","S.N"));
	    //    System.out.print(String.format("%18s","Employee Id"));
	     //   System.out.print(String.format("%13s","Employee Name "));
	       /* System.out.print(String.format("%18s","Employee Salary"));
	        
	        while(rs.next())
	        {
	        	System.out.print(String.format("%5d",rs.getInt("Eid")));
	            System.out.print(String.format("%18s",rs.getString("Ename")));
	            System.out.print(String.format("%10s",rs.getDouble("Esalary")));
	            }
	            */
	        	
	        	
	        	
	        
	        
	        
	        
	        
}       
	        
	        
	        
}

	



