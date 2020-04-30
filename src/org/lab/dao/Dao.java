/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import org.lab.dependances.BaseEntite;
import org.lab.entites.ClientEntite;
import org.lab.entites.FactureEntite;
import org.lab.entites.ProduitEntite;

public class Dao {
/**
 *
 * @author jp
 */
/*public class Dao {

 // DAO = Data Application Object
 // La fabrique
 protected EntityManagerFactory factory = null;
 // Le manager
 protected EntityManager manager = null;
 // La transaction
 protected EntityTransaction transaction = null;
 // Le fichier de persistence
 private String fichier = "LaboProjetPU";

 // Initialisation
 public void init() {
 this.factory = Persistence.createEntityManagerFactory(fichier);
 this.manager = factory.createEntityManager();
 this.transaction = manager.getTransaction();
 //
 this.transaction.begin();
 }
 public void valider() {
 transaction.commit();
    
 }

 // Fermeture
 public void close() {
 if (factory != null) {
 factory.close();
 }
 }

 // Pour renforcer la fermeture de em
 private void closeManager(EntityManager em) {
 if (em != null) {
 if (em.isOpen()) {
 EntityTransaction t = em.getTransaction();
 if (t.isActive()) {
 try {
 t.rollback();
 } catch (PersistenceException e) {
 }
 }
 em.close();
 }
 }
 }

 // Creation d'un manager
 public EntityManager em() {
 this.factory = Persistence.createEntityManagerFactory(fichier);
 this.manager = factory.createEntityManager();
 return this.manager;
 }

 // Preparation
 public<T extends BaseEntite>  void prepare (T entite) {
 /*init();*/
/* manager.persist(entite);
 }

 // Enregistrement
 public <T extends BaseEntite> void save() {
 transaction.commit();
 }

 // Recherche

 // Retourner une liste des produits
 @SuppressWarnings("unchecked")
 public List<ProduitEntite> findAllProduits() {
 // On met le manager a null
 manager = null;
 try {
 // On initialise le manager
 manager = factory.createEntityManager();
 // On initialise la transaction
 manager.getTransaction().begin();
 // utilisation de l'EntityManager
 TypedQuery<ProduitEntite> q = manager.createQuery("FROM ProduitEntite", ProduitEntite.class);
 return q.getResultList();
 } finally {
 if (manager != null) {
 manager.close();
 }
 }
 }

 // Retourner une liste des clients
 @SuppressWarnings("unchecked")
 public List<ClientEntite> findAllClients() {
 // On met le manager a null
 manager = null;
 try {
 // On initialise le manager
 manager = factory.createEntityManager();
 // On initialise la transaction
 manager.getTransaction().begin();
 // utilisation de l'EntityManager
 TypedQuery<ClientEntite> q = manager.createQuery("FROM ClientEntite", ClientEntite.class);
 return q.getResultList();
 } finally {
 if (manager != null) {
 manager.close();
 }
 }
 }

 // Retourner une liste des factures
 @SuppressWarnings("unchecked")
 public List<FactureEntite> findAllFactures() {
 // On met le manager a null
 manager = null;
 try {
 // On initialise le manager
 manager = factory.createEntityManager();
 // On initialise la transaction
 manager.getTransaction().begin();
 // utilisation de l'EntityManager
 TypedQuery<FactureEntite> q = manager.createQuery("FROM FactureEntite", FactureEntite.class);
 return q.getResultList();
 } finally {
 if (manager != null) {
 manager.close();
 }
 }
 }
    */
    
    protected EntityManagerFactory emf = null;
    protected EntityManager em = null;
    protected EntityTransaction transaction = null;

    /**
     * Autheur jpg
     */
    protected String file = "LaboProjetPU";

    public Dao() {  /*constructeur par défaut)*/

    }

    public void init() {
        emf = Persistence.createEntityManagerFactory(file);
        em = emf.createEntityManager();
        transaction = em.getTransaction();
        transaction.begin();
    }

    void annuler() {
        transaction.rollback();

    }

    

    public <T extends BaseEntite> void save() {
        /*init();*/
        transaction.commit();
    }

    public <T extends BaseEntite> void prepare(T entite) {
        /*init();*/
        em.persist(entite);
        System.out.println("Préparation bien fait");
    }

    public void close() {

        em.close();
        emf.close();
    }
    public EntityManager em (){
        emf = Persistence.createEntityManagerFactory(file);
        em = emf.createEntityManager();
        return em;
        
    }
    
    /*public <T extends BaseEntite> void  delete (T entite){
     boolean isPersist = manager.contains(entite);
     T chercheElement;
     isPersist 
     }  */

 // Methode de recherche d'entite
 public <T extends BaseEntite> T recherche(T entite)
 {
 //
 T element = em.find((Class<T>) entite.getClass(), entite.getId());
 if(element == null){
 System.out.println("Element introuvable");
 } else {
 System.out.println("Voici l'lement : "+entite);
 }
 //
 return element;
 }
    
 // Methode de modifier
public <T extends BaseEntite> T update(T entite) {

        //rechercher(entite);
        boolean isPersistence = em.contains(entite);
        T element;
        if (!isPersistence) {
            element = recherche(entite);
        }
        return em.merge(entite);

    }


 // Methode de suppession
 public <T extends BaseEntite> void delete(T entite)
 {
 // 
     if(!em.contains(entite)){
    T persiste = em.find((Class<T>) entite.getClass(), entite.getId());
     if(persiste==null){
         System.err.println(entite + "n'est pas retrouvé");
     }

 em.remove(em.merge(entite));
 save();
     }else{
// On supprime l'entite
 em.remove(entite);
         save();
 }
 
 // On affiche le message
 System.out.println("Element supprime avec succes");
 }

}

