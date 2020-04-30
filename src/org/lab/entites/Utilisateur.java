/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;

import org.lab.dependances.BaseEntite;

/**
 *
 * @author J-P
 */
public class Utilisateur extends BaseEntite {
    private String nomut;
    private String motpasse;
    
    public Utilisateur (){
        super();
    }

    public String getNomut() {
        return nomut;
    }

    public void setNomut(String nomut) {
        this.nomut = nomut;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }
    
    
}
