/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;

import java.util.Date;

public class Adresse {
    
   private String pays;
   private String email;
   private String telephone;
   private Date naissance;
   
   public Adresse (){
       
   }

    public Adresse(String pays, String email, String telephone, Date naissance) {
        this.pays = pays;
        this.email = email;
        this.telephone = telephone;
        this.naissance = naissance;
    }

  

   
    public String getPays() {
        return pays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   
   
    
}
