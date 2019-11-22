package chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public abstract class MyConnection {
    Connection conn;
    Statement stmt;
    
    public MyConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/aumessenger","root","");
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println("Exception e = " + e);
        }
    }
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aumessenger","root","");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }
    abstract public boolean sendMessage(String msg);
    abstract public void receiveMessage();
}