package com.globallogic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","password");
//			Statement stmnt = con.createStatement();
			PreparedStatement ps = con.prepareStatement("select into registration values(?,?,?,?,?)");
			ps.setInt(1, 5);
			ps.setString(2, "Rupesh");
			ps.setInt(3, 2);
			
			
//			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}