/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.Models;

public class ParcAuto {
    
    public int idAuto;
    public String marca;
    public String model;
    
    public ParcAuto (int idAuto, String marca, String model){
        this.idAuto = idAuto;
        this.marca = marca;
        this.model = model;
    }
}
