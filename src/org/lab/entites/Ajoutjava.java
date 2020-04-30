/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.lab.dao.Dao;

/**
 *
 * @author J-P
 */
public class Ajoutjava {

    public static void main(String[] args) {

        Dao daojpa = new Dao();
        daojpa.init();
        FactureEntite facture = new FactureEntite();
        FacturerEntite facturer1 = new FacturerEntite();
        FacturerEntite facturer2 = new FacturerEntite();
        FacturerEntite facturer3 = new FacturerEntite();
        Utilisateur utilisateur = new Utilisateur();

        ProduitEntite produit1 = new ProduitEntite();

        List<FacturerEntite> facturerliste = new ArrayList<>();
        List<FactureEntite> factures = new ArrayList<>();

        /* SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-jj");
         String date_simple = "2015-01-01";*/
        Adresse ad2 = new Adresse("jp", "femi", "aimer", new Date());
        Adresse ad1 = new Adresse("toto", "tata", "email", new Date());

        Utilisateur ut = new Utilisateur();

        ClientEntite client = new ClientEntite();

        client.setNom("Jean");
        client.setPrenom("Pierre");
        client.setAdresse(ad1);
        produit1.setDesignation("Mallot CR7");
        produit1.setPrix(200000);
        facturer1.setFacture(facture);
        facturer1.setProduit(produit1);
        facturer1.setQuantite(120);
        facturerliste.add(facturer1);
        factures.add(facture);
        facture.setClient(client);
        facture.setDateFacture(new Date());
        facture.setFacturer(facturerliste);

        utilisateur.setNomut("jpg");
        utilisateur.setMotpasse("amour");
        daojpa.prepare(utilisateur);

        daojpa.prepare(client);
        daojpa.prepare(produit1);
        daojpa.prepare(facturer1);
        daojpa.prepare(facture);
        daojpa.save();
        daojpa.close();

        /*daojpa.prepare(factures);
         daojpa.prepare(factures2);*/
        System.out.println("OK");

    }

}
