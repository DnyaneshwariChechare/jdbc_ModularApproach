package student_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student_dao {
	public void insertdata() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197?useSSL=false","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into student values(5,'Dnyana',16)");
		System.out.println("dao");
		c.close();
	}
	public void updatedata()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197?useSSL=false","root","root");
		Statement s =c.createStatement();
		s.executeUpdate("update student set stud_age=10 where stud_id=1 ");
		System.out.println("data updated successfully");
		c.close();		
	}
	public void deletedata()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197?useSSL=false","root","root");
		Statement s=c.createStatement();
		s.execute("delete from student where stud_id=2");
		System.out.println(" data is deleted");
		c.close();
	}

}
