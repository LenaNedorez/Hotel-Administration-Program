package main.java.com.HotelManagementSystem;

import java.sql.*;

public class Connection {
    java.sql.Connection c;
    Statement s;
    public Connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///hms","root","");

            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
