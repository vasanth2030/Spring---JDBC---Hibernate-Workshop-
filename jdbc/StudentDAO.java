package com.vasanth.springworkshop.jdbc;
//1. importing the package
import java.sql.*;
public class StudentDAO {
	
	Connection con;
	
	public void establishConnection() throws Exception
	{
		// 2. Registering the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/jdbc_workshop";
				String uname="hbstudent";
				String pass="hbstudent";
				
				// 3. Establishing our connection
				con= DriverManager.getConnection(url,uname,pass);
		
	}
	
	
	public void showStudents() throws Exception{
		
		establishConnection();
		
		//4. Creating our statement
		Statement st=con.createStatement();
		
		//5. Execute our query
		ResultSet rs=st.executeQuery("select * from student");
		
		//6. Processing the result
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		//7. Closing the connection.
		con.close();
		
		//Student stu=new Student(1,"Vasanth","s"); session.save(stu);
		
	}
	
	
	public void insertStudent(int id,String fname,String lname) throws Exception
	{
		establishConnection();
		
		PreparedStatement pst=con.prepareStatement("insert into student values (?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, fname);
		pst.setString(3, lname);
		
		int n=pst.executeUpdate();
		
		System.out.println(n+" rows affected!");
		
		con.close();
		
	}
	
	
	
	

}
