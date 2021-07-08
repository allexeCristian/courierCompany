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
import myPackage.Models.Angajat;
import java.util.*;

public class AngajatiRepository {
    Database database;
    
    public AngajatiRepository (){
        database = new Database();
    }
    
    public List<Angajat> getAngajati () {
        List<Angajat> angajati = new ArrayList<>();
        try {
            ResultSet rs = database.executeQuery("SELECT marca, nume, prenume, rol, adresa, nrContact, idAuto FROM curier.angajati;");
            while(rs.next()){
                Angajat a = new Angajat(rs.getInt("marca"), rs.getString("nume"), rs.getString("prenume"), rs.getString("rol"),
                        rs.getString("adresa"), rs.getString("nrContact"), rs.getInt("idAuto"));
                angajati.add(a);
            }
            return angajati;
        } catch (SQLException ex) {
            
            Logger.getLogger(AngajatiRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void insertAngajat (Angajat a) {
        String idAuto = a.idAuto == 0 ? "NULL" : "\""+a.idAuto+"\"";
        String query = "insert into curier.angajati(nume, prenume, rol, adresa, nrContact, idAuto) values (\""
                +a.nume+"\", \""+a.prenume+"\", \""+a.rol+"\", \""+a.adresa+"\", \""+a.nrContact+"\", "+idAuto+")";
        database.execute(query);
    }
    
    public void deleteAngajat (int id) {
        String query = "DELETE FROM curier.angajati WHERE marca="+id+";";
        database.execute(query);
    }
}
