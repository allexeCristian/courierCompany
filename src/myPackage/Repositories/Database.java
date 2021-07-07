package myPackage.Repositories;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    Connection con;
    
    Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/curier", "root", "mysql");
                    //here sonoo is database name, root is username and password                          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    ResultSet executeQuery (String query) {
        try {
            Statement stmt = con.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    void execute (String query) {
        try {
            Statement stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
