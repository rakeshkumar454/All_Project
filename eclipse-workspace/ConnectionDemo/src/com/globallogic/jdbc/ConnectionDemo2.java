package com.globallogic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","password");
			Statement stmnt = con.createStatement();
			
			stmnt.execute("insert into registration values('9','Kajol','8637245540','Nurshing','4000')");
			System.out.println("Connect to student db");
			ResultSet result = stmnt.executeQuery("select * from registration");
	
			while(result.next())
			{
				System.out.println(result.getInt(1) +" "+ result.getString(2) +" "+ result.getInt(3) +" "+ result.getString(4)+" "+result.getInt(5));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
