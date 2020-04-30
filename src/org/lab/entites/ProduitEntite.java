/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;
import java.util.ArrayList;
import java.util.List;
import org.lab.dependances.BaseEntite;

/**
 *
 * @author J-P
 */
public class ProduitEntite extends BaseEntite {
    //attribut
    private String designation;
    private int prix;    
    private List<FacturerEntite> facturer = new ArrayList<>();

    public ProduitEntite() {
        super();
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public List<FacturerEntite> getFacturer() {
        return facturer;
    }

    public void setFacturer(List<FacturerEntite> facturer) {
        this.facturer = facturer;
    }
    
    
    
}
