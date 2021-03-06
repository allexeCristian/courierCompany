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
import myPackage.Models.ParcAuto;

/**
 *
 * @author allex
 */
public class ParcAutoRepository {
        Database database;
    
    public ParcAutoRepository (){
        database = new Database();
    }
    
    public List<ParcAuto> getParcAuto () {
        List<ParcAuto> parcAuto = new ArrayList<>();
        try {
            ResultSet rs = database.executeQuery("SELECT * FROM curier.parcauto;");
            while(rs.next()){
                ParcAuto a = new ParcAuto(rs.getInt("idAuto"), rs.getString("marca"), rs.getString("model"), rs.getString("nrInmatriculare"));
                parcAuto.add(a);
            }
            return parcAuto;
        } catch (SQLException ex) {
            
            Logger.getLogger(ParcAutoRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void insertParcAuto (ParcAuto p) {
        String query = "insert into curier.parcauto(marca, model, nrInmatriculare) values (\""+p.marca+"\", \""+p.model+"\", \""+p.nrInmatriculare+"\")";
        database.execute(query);
    }
    
    public void deleteParcAuto (int id) {
        String query = "DELETE FROM curier.parcauto WHERE idAuto="+id+";";
        database.execute(query);
    }
}
