/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login2;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author desalegn
 */
public class MysqlConnect {
    Connection Conn=null;
    public static Connection ConnectDB() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.driver");
        Connection Conn=DriverManager.getConnection("login","root","1527");
        JOptionPane.showMessageDialog(null, "connected to database");
        return Conn;
    }
}
