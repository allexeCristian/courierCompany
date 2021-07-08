/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.Models;

/**
 *
 * @author allex
 */
public class User {
    
    public String user;
    public String rol;
    
    public User(String user, String rol){
        this.rol = rol;
        this.user = user;
    }
}
