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
public class Colete {
    
    public int awb;
    public int greutate;
    public String status;
    public String adresaDestinatie;
    public int marca;
    public int idClientiEx;
    public int idClientiDe;
    
    public Colete (int awb, int greutate, String status, String adresaDestinatie, int marca, int idClientiEx, int idClientiDe){
        this.adresaDestinatie = adresaDestinatie;
        this.awb = awb;
        this.greutate = greutate;
        this.idClientiDe = idClientiDe;
        this.idClientiEx = idClientiEx;
        this.marca = marca;
        this.status = status;
                
    }
}
