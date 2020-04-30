/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.lab.dependances.BaseEntite;

/* @author J-P */
public class FactureEntite extends BaseEntite {

    //ATTRIBUTS

    private Date dateFacture; //DATE DE FATURE A RENSEIGNER 
    private ClientEntite client; // 

    private List<FacturerEntite> facturer = new ArrayList<>();

    public FactureEntite() { //CONSTRUCTEUR  
        super();
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public ClientEntite getClient() {
        return client;
    }

    public void setClient(ClientEntite client) {
        this.client = client;
    }

    public List<FacturerEntite> getFacturer() {
        return facturer;
    }

    public void setFacturer(List<FacturerEntite> facturer) {
        this.facturer = facturer;
    }
    
}
