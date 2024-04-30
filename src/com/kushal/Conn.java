package com.kushal;

import java.sql.Connection;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn(){
        //Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "mySQL@kusHAL03");
            s = c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
