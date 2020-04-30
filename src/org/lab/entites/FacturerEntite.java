/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;

import org.lab.dependances.BaseEntite;

public class FacturerEntite extends BaseEntite {
    
    private int quantite;
    private FactureEntite facture = new FactureEntite();
    private ProduitEntite produit = new ProduitEntite();

    public FacturerEntite(){
       super (); 
    }
    
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public FactureEntite getFacture() {
        return facture;
    }

    public void setFacture(FactureEntite facture) {
        this.facture = facture;
    }

  

    public ProduitEntite getProduit() {
        return produit;
    }

    public void setProduit(ProduitEntite produit) {
        this.produit = produit;
    }
    
    /*
    public String toString{
         return String.format("[%s, %s; %s]", getQuantite(), getFacture(), getProduit());
}*/

  
}