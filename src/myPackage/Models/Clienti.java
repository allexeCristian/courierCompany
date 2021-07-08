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
public class Clienti {
    
    public int idClienti;
    public String nume;
    public String prenume;
    public String adresa;
    public String nrContact;
    
    public Clienti (int idClienti, String nume, String prenume, String adresa, String nrContact){
        this.adresa = adresa;
        this.idClienti = idClienti;
        this.nrContact = nrContact;
        this.nume = nume;
        this.prenume = prenume;
        
    }
}
