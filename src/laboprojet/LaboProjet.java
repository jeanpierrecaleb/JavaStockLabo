/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboprojet;


import org.lab.vues.Login;

/**
 *
 * @author J-P
 */
public class LaboProjet {
    public static void main(String[] args){
  
    Login loger = new Login(new java.awt.Frame(), true);
    loger.setVisible(true);
     System.out.println("Commencer la partie!");
            }
    
    /*public static void main(String[] args) throws ParseException{
        
    Dao daojpa = new Dao(); /*Création de la dao*/
       
    


   
        //liste deux liste de produits
  /*  List<ProduitEntite> produits = new ArrayList<>();
    List<ProduitEntite> produits2 = new ArrayList<>();
    //Une liste de facture
    FactureEntite facture = new FactureEntite();
        FacturerEntite facturer1 = new FacturerEntite();
        FacturerEntite facturer2 = new FacturerEntite();
        FacturerEntite facturer3 = new FacturerEntite();



    List<FacturerEntite> facturerliste = new ArrayList<>();
    List<FactureEntite> factures = new ArrayList<>();

   
    
    ClientEntite client1 = new ClientEntite();
    ClientEntite client2 = new ClientEntite();
    
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-jj");
    String date_simple = "2015-01-01";
    Date date   = formatDate.parse(date_simple);
    
    Adresse ad2 = new Adresse ("jp","femi","aimer",date);
    Adresse ad1 = new Adresse ("toto","tata","email",date);
    
    daojpa.init();  //Initialisation de la daojpa

    //Rensignons les différents clients*//*
    client1.setNom("Marc");
    client1.setPrenom("JOjo");
    client1.setAdresse(ad1);
    client1.setEncodeur("Ilaci");
    client2.setNom("Jean");
    client2.setPrenom("Pierre");
    client2.setAdresse(ad2); 
    
    /*Instanciation des objets produit*//*
    ProduitEntite produit1 = new ProduitEntite ();
    ProduitEntite produit2 = new ProduitEntite();
    ProduitEntite produit3 = new ProduitEntite();

    //Mettre les produits dans la base
    produit1.setDesignation("Mallot CR7");
    produit1.setPrix(20000);
    produit2.setDesignation("Mallot Messi");
    produit2.setPrix(25000);
    
    produit3.setDesignation("Toyota Accura");
    produit3.setPrix(5000000);
    
    /*Ajout du produit1 à la liste produits*//*
    produits.add(produit1);
    produits.add(produit2);
    produits.add(produit3);
    
    //Ajout du produit3 et 1 à la liste produits2
    produits2.add(produit3);
    produits2.add(produit1);
    
    /*Remplir la facture*/    /*    
    facture.setClient(client1);
   /* facture.setProduits(produits);*/
  /*  facture.setDatefacture(new Date());
    
   /* facture2.setClient(client1);*/
   /* facture2.setProduits(produits2);*/
    /*facture2.setDatefacture(new Date());*/

//Remplir la facture3
   /* facture3.setClient(client2);*/
    /*facture3.setProduits(produits);
    facture.setProduits(produits2);*/
    /*facture3.setDatefacture(new Date());*/

    //Ajouter les factures aux liste de facture
    /*factures.add(facture);
    /*factures.add(facture);
    factures2.add(facture3);*/
    
   /* client1.setFactures(factures);
  /*  client2.setFactures(factures2);*/
    
    /*daojpa.prepare(client1);
    daojpa.prepare(client2);
    
   /* daojpa.prepare(facture);
   /* daojpa.prepare(facture2);
    daojpa.prepare(facture3);*/
 
    
    
    /*daojpa.prepare(produit1);
    daojpa.prepare(produit2);
    daojpa.prepare(produit3);
    
    /*daojpa.prepare(factures);
    daojpa.prepare(factures2);*/

  /*  daojpa.valider();*/
    /*----------------------------------------*/
    
        
        
        
        
        
/*
        daojpa.close();
    }*/
}