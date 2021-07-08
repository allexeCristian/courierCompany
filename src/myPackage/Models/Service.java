/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.Models;

public class Service {
    
    public int idAuto;
    public String data;
    public int km;
    public String mentiuni;
    
    public Service (int idAuto, String data, int km, String mentiuni){
        this.idAuto = idAuto;
        this.data = data;
        this.km = km;
        this.mentiuni = mentiuni;        
    }
}