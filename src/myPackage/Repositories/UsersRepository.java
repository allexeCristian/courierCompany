/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import myPackage.Models.User;

/**
 *
 * @author allex
 */
public class UsersRepository {
    
    Database database;
    
    public UsersRepository (){
        database = new Database();
    }
    
    public User getUser (String user, String pw) {
        try {
            ResultSet rs = database.executeQuery("SELECT user, rol FROM curier.users where user=\""+user+"\" and pw=\""+pw+"\"");
            if(rs.next()){
                User a = new User(rs.getString("user"), rs.getString("rol"));
                return a;
            } else {
                return null;   
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(ServiceRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
