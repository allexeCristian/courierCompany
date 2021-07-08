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
import myPackage.Models.Service;

/**
 *
 * @author allex
 */
public class ServiceRepository {
    
    Database database;
    
    public ServiceRepository (){
        database = new Database();
    }

    public List<Service> getService () {
        List<Service> service = new ArrayList<>();
        try {
            ResultSet rs = database.executeQuery("SELECT * FROM curier.service;");
            while(rs.next()){
                Service a = new Service(rs.getInt("idAuto"), rs.getString("data"), rs.getInt("km"), rs.getString("mentiuni"));
                service.add(a);
            }
            return service;
        } catch (SQLException ex) {
            
            Logger.getLogger(ServiceRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void insertService (Service s) {
        String query = "insert into curier.service(idAuto, data, km, mentiuni) values (\""+s.idAuto+"\",\""+s.data+"\", \""+s.km+"\", \""+s.mentiuni+"\")";
        database.execute(query);
    }
    
    public void deleteService (int id) {
        String query = "DELETE FROM curier.service WHERE idAuto="+id+";";
        database.execute(query);
    }
}
