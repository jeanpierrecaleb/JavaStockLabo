/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.dependances;

import java.util.Date;

public class BaseEntite {
   /*ATTRIBUTS*/
        protected long id;
        protected Date dateCreation = new Date ();
        protected int version;
        protected String encodeur = "jp";

        public BaseEntite() { /* CONSTRUCTEUR PAR DEFAUT*/
            
        }
/*GETTERS ET SETTERS*/
    public long getId() { 
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEncodeur() {
        return encodeur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setEncodeur(String encodeur) {
        this.encodeur = encodeur;
    }
         
    public String toString (){
        return String.format("[%s]", getId());
    }
        
        
    }
