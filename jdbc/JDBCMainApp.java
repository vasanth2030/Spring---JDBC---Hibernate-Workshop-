package com.vasanth.springworkshop.jdbc;

import java.sql.*;

public class JDBCMainApp {

	public static void main(String[] args) throws Exception {
		//DAO- DATA ACCESS OBJECT	
		
		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); String
		 * url="jdbc:mysql://localhost:3306/jdbc_workshop"; String uname="hbstudent";
		 * String pass="hbstudent";
		 * 
		 * // 3. Establishing our connection Connection con=
		 * DriverManager.getConnection(url,uname,pass);
		 * 
		 * Statement st=con.createStatement();
		 * 
		 * int n=st.executeUpdate("insert into student values (7,'Yogesh','Lahane')");
		 * 
		 * System.out.println(n+" rows affected!");
		 * 
		 * con.close();
		 */
		
		StudentDAO stuDAO=new StudentDAO();
		
		stuDAO.insertStudent(8, "Onkar", "Nagarkar");
		
		stuDAO.showStudents();

	}

}
