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
    public String nrInmatriculare;
    
    public ParcAuto (int idAuto, String marca, String model, String nrInmatriculare){
        this.idAuto = idAuto;
        this.marca = marca;
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
    }
    
    @Override
    public String toString()
    {
        return nrInmatriculare;
    }
}
