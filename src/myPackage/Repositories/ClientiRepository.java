/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myPackage.Models.Clienti;

/**
 *
 * @author allex
 */
public class ClientiRepository {
    
    Database database;
    
    public ClientiRepository (){
        database = new Database();
    }
    
    public List<Clienti> getClienti () {
        List<Clienti> clienti = new ArrayList<>();
        try {
            ResultSet rs = database.executeQuery("SELECT * FROM curier.clienti;");
            while(rs.next()){
                Clienti a = new Clienti(rs.getInt("idClienti"), rs.getString("nume"), rs.getString("prenume"), rs.getString("adresa"), rs.getString("nrContact"));
                clienti.add(a);
            }
            return clienti;
        } catch (SQLException ex) {
            
            Logger.getLogger(ServiceRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void insertClienti (Clienti c) {
        String query = "insert into curier.clienti(nume, prenume, adresa, nrContact) values (\""+c.nume+"\", \""+c.prenume+"\", \""+c.adresa+"\", \""+c.nrContact+"\")";
        database.execute(query);
    }
    
    public void deleteClienti (int id) {
        String query = "DELETE FROM curier.clienti WHERE idClienti="+id+";";
        database.execute(query);
    }
}
