package myPackage.Models;

public class Angajat {
    
    public int marca;
    public String nume;
    public String prenume;
    public String rol;
    public String adresa;
    public String nrContact;
    public Integer idAuto;
    
    public Angajat (int marca, String nume, String prenume, String rol, String adresa, String nrContact, Integer idAuto){
        this.marca = marca;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.idAuto = idAuto;
        this.nrContact = nrContact;
        this.rol = rol;
    }
}
