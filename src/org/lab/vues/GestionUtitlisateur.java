/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import org.lab.dao.Dao;
import org.lab.entites.Adresse;
import org.lab.entites.ProduitEntite;
import org.lab.entites.Utilisateur;

/**
 *
 * @author J-P
 */
public class GestionUtitlisateur extends javax.swing.JDialog {

    private Dao dao = new Dao();
    Adresse adresse = new Adresse();
    private Utilisateur utilisateur = new Utilisateur();
    private List<Utilisateur> listeUtilisateur = new ArrayList<>();
    private Vector vecteur = new Vector();

    //méthode de update base
    public void miseàjourutilisateurs() {
        //On vide le vecteur 
        vecteur.clear();
        //renvoie du vecteur vide à la liste
        IHM_liste_utilisateur.setListData(vecteur);
        //Rechercher tous les clients dans la base de données
        Query req = dao.em().createQuery("SELECT p from Utilisateur p");
//Rcupéronsle résulltat de la requete
        listeUtilisateur = req.getResultList();
        //On affiche
        for (Utilisateur p : listeUtilisateur) {
            //On remplie le vecteur 
            vecteur.add(p.getId() + "- " + p.getNomut());
            //Vou devez remplir la liste
            IHM_liste_utilisateur.setListData((vecteur));
        }
    }

    /**
     * Creates new form GestionUtitlisateur
     */
    public GestionUtitlisateur(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Menu parametre
        IHM_Menu_Parametre.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //Menu Operation
        IHM_Menu_Operation.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuDeselected(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        IHM_Menu_Etats.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //Menu Aide
        IHM_Menu_Aide.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuDeselected(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //Client
        IHM_Menu_Client.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GestionClient gestionClient = new GestionClient(new java.awt.Frame(), true);
                gestionClient.setVisible(true);
                
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //Produit
        IHM_Menu_Produit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                dispose();
                GestionProduit gestionProduit = new GestionProduit(new java.awt.Frame(), true);
                gestionProduit.setVisible(true);
            }
        });
        IHM_Menu_Utiisateur.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                dispose();
                GestionUtitlisateur gestionUtitlisateur = new GestionUtitlisateur(new java.awt.Frame(), true);
                gestionUtitlisateur.setVisible(true);
            }
        });
        IHM_Menu_Quitter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
            }
        });
        IHM_Menu_Facturer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        IHM_Listedesclients.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        IHM_Listedesproduits.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //Listes utilisateurs
        IHM_Listedesutisateurs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                dispose();
                ListeClient listeClient = new ListeClient(new java.awt.Frame(), true);
                listeClient.setVisible(true);
            }
        });
        //liste factures
        IHM_Listedesfactures.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //Liste des Help
        IHM_contenuaide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //cacher les boutons
        IHM_Supprimer.setVisible(false);
        IHM_Modifier.setVisible(false);
        miseàjourutilisateurs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IHM_Nom = new javax.swing.JTextField();
        IHM_Motdepasse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IHM_liste_utilisateur = new javax.swing.JList();
        IHM_Annuler = new javax.swing.JButton();
        IHM_Ajouter = new javax.swing.JButton();
        IHM_Supprimer = new javax.swing.JButton();
        IHM_Modifier = new javax.swing.JButton();
        IHM_Quittter = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        IHM_Menu_Parametre = new javax.swing.JMenu();
        IHM_Menu_Client = new javax.swing.JMenuItem();
        IHM_Menu_Produit = new javax.swing.JMenuItem();
        IHM_Menu_Utiisateur = new javax.swing.JMenuItem();
        IHM_Menu_Quitter = new javax.swing.JMenuItem();
        IHM_Menu_Operation = new javax.swing.JMenu();
        IHM_Menu_Facturer = new javax.swing.JMenuItem();
        IHM_Menu_Etats = new javax.swing.JMenu();
        IHM_Listedesclients = new javax.swing.JMenuItem();
        IHM_Listedesutisateurs = new javax.swing.JMenuItem();
        IHM_Listedesfactures = new javax.swing.JMenuItem();
        IHM_Listedesproduits = new javax.swing.JMenuItem();
        IHM_Menu_Aide = new javax.swing.JMenu();
        IHM_contenuaide = new javax.swing.JMenuItem();
        IHM_contacts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(null);

        jLabel3.setText("GESTION UTILISATEURS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(238, 11, 118, 14);

        jLabel1.setText("Nom");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 66, 87, 24);

        IHM_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_NomActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Nom);
        IHM_Nom.setBounds(116, 66, 166, 24);
        jPanel1.add(IHM_Motdepasse);
        IHM_Motdepasse.setBounds(116, 101, 166, 24);

        jLabel2.setText("Mot de passe");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 101, 74, 24);

        IHM_liste_utilisateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IHM_liste_utilisateurMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IHM_liste_utilisateur);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 31, 317, 285);

        IHM_Annuler.setText("Annuler");
        IHM_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_AnnulerActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Annuler);
        IHM_Annuler.setBounds(67, 259, 69, 23);

        IHM_Ajouter.setText("Ajouter");
        IHM_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_AjouterActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Ajouter);
        IHM_Ajouter.setBounds(168, 259, 69, 23);

        IHM_Supprimer.setText("Supprimer");
        IHM_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_SupprimerActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Supprimer);
        IHM_Supprimer.setBounds(156, 293, 81, 23);

        IHM_Modifier.setText("Modifier");
        IHM_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ModifierActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Modifier);
        IHM_Modifier.setBounds(67, 293, 71, 23);

        IHM_Quittter.setText("Quitter");
        IHM_Quittter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_QuittterActionPerformed(evt);
            }
        });
        jPanel1.add(IHM_Quittter);
        IHM_Quittter.setBounds(119, 327, 67, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 0, 670, 410);

        IHM_Menu_Parametre.setText("Parametres");

        IHM_Menu_Client.setText("Client");
        IHM_Menu_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_Menu_ClientActionPerformed(evt);
            }
        });
        IHM_Menu_Parametre.add(IHM_Menu_Client);

        IHM_Menu_Produit.setText("Produit");
        IHM_Menu_Produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_Menu_ProduitActionPerformed(evt);
            }
        });
        IHM_Menu_Parametre.add(IHM_Menu_Produit);

        IHM_Menu_Utiisateur.setText("Utilisateur");
        IHM_Menu_Utiisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_Menu_UtiisateurActionPerformed(evt);
            }
        });
        IHM_Menu_Parametre.add(IHM_Menu_Utiisateur);

        IHM_Menu_Quitter.setText("Quitter");
        IHM_Menu_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_Menu_QuitterActionPerformed(evt);
            }
        });
        IHM_Menu_Parametre.add(IHM_Menu_Quitter);

        jMenuBar1.add(IHM_Menu_Parametre);

        IHM_Menu_Operation.setText("Operations");

        IHM_Menu_Facturer.setText("Facturer");
        IHM_Menu_Facturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_Menu_FacturerActionPerformed(evt);
            }
        });
        IHM_Menu_Operation.add(IHM_Menu_Facturer);

        jMenuBar1.add(IHM_Menu_Operation);

        IHM_Menu_Etats.setText("Etats");

        IHM_Listedesclients.setText("Liste des Clients");
        IHM_Listedesclients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ListedesclientsActionPerformed(evt);
            }
        });
        IHM_Menu_Etats.add(IHM_Listedesclients);

        IHM_Listedesutisateurs.setText("Liste des Utilisateurs");
        IHM_Listedesutisateurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ListedesutisateursActionPerformed(evt);
            }
        });
        IHM_Menu_Etats.add(IHM_Listedesutisateurs);

        IHM_Listedesfactures.setText("Les factures");
        IHM_Listedesfactures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ListedesfacturesActionPerformed(evt);
            }
        });
        IHM_Menu_Etats.add(IHM_Listedesfactures);

        IHM_Listedesproduits.setText("Liste des Produits");
        IHM_Listedesproduits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ListedesproduitsActionPerformed(evt);
            }
        });
        IHM_Menu_Etats.add(IHM_Listedesproduits);

        jMenuBar1.add(IHM_Menu_Etats);

        IHM_Menu_Aide.setText("Aide");

        IHM_contenuaide.setText("Contenu de l'aide");
        IHM_contenuaide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_contenuaideActionPerformed(evt);
            }
        });
        IHM_Menu_Aide.add(IHM_contenuaide);

        IHM_contacts.setText("Contacts");
        IHM_contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_contactsActionPerformed(evt);
            }
        });
        IHM_Menu_Aide.add(IHM_contacts);

        jMenuBar1.add(IHM_Menu_Aide);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IHM_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IHM_NomActionPerformed

    private void IHM_liste_utilisateurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IHM_liste_utilisateurMouseClicked
        // TODO add your handling code here:
        String ligne = (String) IHM_liste_utilisateur.getSelectedValue();

        char at1 = ligne.charAt(0);
        char at2 = ligne.charAt(1);

        int id1 = Character.getNumericValue(at1);
        int id2 = Character.getNumericValue(at2) + 10;

        if (id1 < 10) {

            char charac = ligne.charAt(0);
            // int id = Character.getNumericValue(charac);
            Query req1 = dao.em().createQuery("SELECT p FROM Utilisateur p WHERE p.id=:id");
            req1.setParameter("id", id1);
            utilisateur = (Utilisateur) req1.getSingleResult();
            //Affichage de les éléments récupéré pour les modifiés
            IHM_Nom.setText(utilisateur.getNomut());
            IHM_Motdepasse.setText(utilisateur.getMotpasse());
            //IHM_verifiermotdepasse.setText(Double.toString(produit.getQuantite()));

            //Afficher les boutons supprimer et modifier à la sélection du client dans la liste
        } else {
            //char charac = ligne.charAt(1);
            //int id = Character.getNumericValue(charac);
            Query req1 = dao.em().createQuery("SELECT p FROM Utilisateur p WHERE p.id=:id");
            req1.setParameter("id", id2);
            utilisateur = (Utilisateur) req1.getSingleResult();
            //Affichage de les éléments récupéré pour les modifiés
            IHM_Nom.setText(utilisateur.getNomut());
            IHM_Motdepasse.setText((""));
            // IHM_verifiermotdepasse.setText(Double.toString(produit.getQuantite()));
            //Afficher les boutons supprimer et modifier à la sélection du client dans la liste

        }
        IHM_Modifier.setVisible(true);
        IHM_Supprimer.setVisible(true);
        IHM_Ajouter.setVisible(false);

    }//GEN-LAST:event_IHM_liste_utilisateurMouseClicked

    private void IHM_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_AnnulerActionPerformed
        // TODO add your handling code here:
        initChampU();
        IHM_Modifier.setVisible(false);
        IHM_Supprimer.setVisible(false);
        IHM_Ajouter.setVisible(true);
    }//GEN-LAST:event_IHM_AnnulerActionPerformed

    private void IHM_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_AjouterActionPerformed
        // TODO add your handling code here:
        if ((IHM_Nom.getText().isEmpty() || IHM_Motdepasse.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les cases requises ");
        } else {
            dao.init();

            utilisateur.setNomut(IHM_Nom.getText());
            utilisateur.setMotpasse((IHM_Motdepasse.getText()));
            //utilisateur.set(Double.parseDouble(IHM_verifiermotdepasse.getText()));
            //
            dao.prepare(utilisateur);
            dao.save();
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Insertion de l'utilisateur bien fait ");

            initChampU();
            miseàjourutilisateurs();

        }
    }//GEN-LAST:event_IHM_AjouterActionPerformed

    private void IHM_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_SupprimerActionPerformed

        dao.init();

            //utilisateur.setNomut(IHM_Nom.getText());
        // utilisateur.setMotpasse((IHM_Motdepasse.getText()));
        //utilisateur.setQuantite(Double.parseDouble(IHM_verifiermotdepasse.getText()));
        //
        dao.delete(utilisateur);

        dao.close();
        //
        JOptionPane.showMessageDialog(this, "Suppression du produit bien fait ");

        initChampU();
        miseàjourutilisateurs();
        IHM_Modifier.setVisible(false);
        IHM_Supprimer.setVisible(false);
        IHM_Ajouter.setVisible(true);

    }//GEN-LAST:event_IHM_SupprimerActionPerformed

    private void IHM_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ModifierActionPerformed
        // TODO add your handling code here
        if (IHM_Nom.getText().isEmpty() || IHM_Motdepasse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les cases requises ");
        } else {
            dao.init();

            utilisateur.setNomut(IHM_Nom.getText());
            utilisateur.setMotpasse((IHM_Motdepasse.getText()));
            //produit.setQuantite(Double.parseDouble(IHM_verifiermotdepasse.getText()));
            //
            dao.update(utilisateur);
            dao.save();
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Modification de l'utilisateur bien fait ");

            initChampU();
            miseàjourutilisateurs();
        }
        IHM_Modifier.setVisible(false);
        IHM_Supprimer.setVisible(false);
        IHM_Ajouter.setVisible(true);

    }//GEN-LAST:event_IHM_ModifierActionPerformed

    private void IHM_QuittterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_QuittterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_IHM_QuittterActionPerformed

    private void IHM_Menu_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_Menu_ClientActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        GestionClient gestionClient = new  GestionClient(new java.awt.Frame(), true);
        gestionClient.setVisible(true);
    }//GEN-LAST:event_IHM_Menu_ClientActionPerformed

    private void IHM_Menu_ProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_Menu_ProduitActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        GestionProduit gestionProduit = new  GestionProduit(new java.awt.Frame(), true);
        gestionProduit.setVisible(true);
    }//GEN-LAST:event_IHM_Menu_ProduitActionPerformed

    private void IHM_Menu_UtiisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_Menu_UtiisateurActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        GestionUtitlisateur gestionUtitlisateur = new  GestionUtitlisateur(new java.awt.Frame(), true);
        gestionUtitlisateur.setVisible(true);
    }//GEN-LAST:event_IHM_Menu_UtiisateurActionPerformed

    private void IHM_Menu_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_Menu_QuitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_IHM_Menu_QuitterActionPerformed

    private void IHM_ListedesclientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ListedesclientsActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        ListeClient listeclient = new  ListeClient(new java.awt.Frame(), true);
        listeclient.setVisible(true);
    }//GEN-LAST:event_IHM_ListedesclientsActionPerformed

    private void IHM_ListedesutisateursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ListedesutisateursActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        ListeProduit listeProduit = new  ListeProduit(new java.awt.Frame(), true);
        listeProduit.setVisible(true);
    }//GEN-LAST:event_IHM_ListedesutisateursActionPerformed

    private void IHM_ListedesfacturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ListedesfacturesActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        ListeFacture listeFacture = new  ListeFacture(new java.awt.Frame(), true);
        listeFacture.setVisible(true);
    }//GEN-LAST:event_IHM_ListedesfacturesActionPerformed

    private void IHM_ListedesproduitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ListedesproduitsActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        ListeProduit listeProduit = new  ListeProduit(new java.awt.Frame(), true);
        listeProduit.setVisible(true);
    }//GEN-LAST:event_IHM_ListedesproduitsActionPerformed

    private void IHM_contenuaideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_contenuaideActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Aide aide = new Aide (new java.awt.Frame(), true);
        aide.setVisible(true);
    }//GEN-LAST:event_IHM_contenuaideActionPerformed

    private void IHM_contactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_contactsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "GBEDJISSI Jean-Pierre \n Tél : 66122572   \n jeanpierrecaleb@gmail.com");
    }//GEN-LAST:event_IHM_contactsActionPerformed

    private void IHM_Menu_FacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_Menu_FacturerActionPerformed
        // TODO add your handling code here
        this.dispose();
        GestionFacture gestfact = new GestionFacture(new java.awt.Frame(), true);
        gestfact.setVisible(true);
    }//GEN-LAST:event_IHM_Menu_FacturerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionUtitlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUtitlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUtitlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUtitlisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionUtitlisateur dialog = new GestionUtitlisateur(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void initChampU() {
        IHM_Nom.setText("");
        IHM_Motdepasse.setText("");
  

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IHM_Ajouter;
    private javax.swing.JButton IHM_Annuler;
    private javax.swing.JMenuItem IHM_Listedesclients;
    private javax.swing.JMenuItem IHM_Listedesfactures;
    private javax.swing.JMenuItem IHM_Listedesproduits;
    private javax.swing.JMenuItem IHM_Listedesutisateurs;
    private javax.swing.JMenu IHM_Menu_Aide;
    private javax.swing.JMenuItem IHM_Menu_Client;
    private javax.swing.JMenu IHM_Menu_Etats;
    private javax.swing.JMenuItem IHM_Menu_Facturer;
    private javax.swing.JMenu IHM_Menu_Operation;
    private javax.swing.JMenu IHM_Menu_Parametre;
    private javax.swing.JMenuItem IHM_Menu_Produit;
    private javax.swing.JMenuItem IHM_Menu_Quitter;
    private javax.swing.JMenuItem IHM_Menu_Utiisateur;
    private javax.swing.JButton IHM_Modifier;
    private javax.swing.JTextField IHM_Motdepasse;
    private javax.swing.JTextField IHM_Nom;
    private javax.swing.JButton IHM_Quittter;
    private javax.swing.JButton IHM_Supprimer;
    private javax.swing.JMenuItem IHM_contacts;
    private javax.swing.JMenuItem IHM_contenuaide;
    private javax.swing.JList IHM_liste_utilisateur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
