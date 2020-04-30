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
public class ClientEntite extends BaseEntite {
    //
    private String nom;
    private String prenom;
    //
    private Adresse adresse;
    //
    private List<FactureEntite> factures = new ArrayList<>();
    
    //

    public ClientEntite() {
        super();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<FactureEntite> getFactures() {
        return factures;
    }

    public void setFactures(List<FactureEntite> factures) {
        this.factures = factures;
    }
    
    //
    @Override
    public String toString()
    {
        return String.format("%s, %s", getId(), getNom());
    }
}
