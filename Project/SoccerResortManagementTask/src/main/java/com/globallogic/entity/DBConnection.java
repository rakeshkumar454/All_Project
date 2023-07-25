package com.globallogic.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection con;
    private DBConnection() {

    }
    public static Connection getConnection() {
        if(con== null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:Mysql://localhost:3306/Guest","root","password");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}
