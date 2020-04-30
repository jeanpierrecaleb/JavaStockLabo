/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lab.vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import laboprojet.PrintPanel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import org.lab.dao.Dao;
import org.lab.entites.ProduitEntite;
import org.lab.entites.Utilisateur;

/**
 *
 * @author J-P
 */
public class ListeUtilisateur extends javax.swing.JDialog {

    private List<Utilisateur> listeUtilisateur = new ArrayList<>();
    private int pointonclient = 0;
    Dao dao = new Dao();

    /**
     * Creates new form steUtilisateur
     */
    public ListeUtilisateur(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        miseàjourlisteut();
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IHM_panel_listeclient = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IHM_table_utilisateur = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        IHM_Imprimer = new javax.swing.JButton();
        IHM_NouveauEnregistrement = new javax.swing.JButton();
        IHM_Quitter = new javax.swing.JButton();
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

        jLabel1.setText("LISTE Utilisateur ");

        IHM_table_utilisateur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Mdp", "Autres"
            }
        ));
        jScrollPane1.setViewportView(IHM_table_utilisateur);

        javax.swing.GroupLayout IHM_panel_listeclientLayout = new javax.swing.GroupLayout(IHM_panel_listeclient);
        IHM_panel_listeclient.setLayout(IHM_panel_listeclientLayout);
        IHM_panel_listeclientLayout.setHorizontalGroup(
            IHM_panel_listeclientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IHM_panel_listeclientLayout.createSequentialGroup()
                .addGroup(IHM_panel_listeclientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IHM_panel_listeclientLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IHM_panel_listeclientLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        IHM_panel_listeclientLayout.setVerticalGroup(
            IHM_panel_listeclientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IHM_panel_listeclientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        IHM_Imprimer.setText("Imprimer");
        IHM_Imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ImprimerActionPerformed(evt);
            }
        });

        IHM_NouveauEnregistrement.setText("Nouveau utilisateur");
        IHM_NouveauEnregistrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_NouveauEnregistrementActionPerformed(evt);
            }
        });

        IHM_Quitter.setText("Quitter");
        IHM_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_QuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IHM_Imprimer)
                .addGap(106, 106, 106)
                .addComponent(IHM_NouveauEnregistrement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(IHM_Quitter)
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IHM_NouveauEnregistrement)
                    .addComponent(IHM_Imprimer)
                    .addComponent(IHM_Quitter))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(IHM_panel_listeclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IHM_panel_listeclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IHM_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_QuitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_IHM_QuitterActionPerformed

    private void IHM_ImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ImprimerActionPerformed
        // TODO add your handling code here:
        PrintPanel printer = new PrintPanel(IHM_panel_listeclient);
        printer.print();
    }//GEN-LAST:event_IHM_ImprimerActionPerformed

    private void IHM_NouveauEnregistrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_NouveauEnregistrementActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GestionUtitlisateur gestionutilisateur = new GestionUtitlisateur(new java.awt.Frame(), true);
        gestionutilisateur.setVisible(true);
    }//GEN-LAST:event_IHM_NouveauEnregistrementActionPerformed

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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ListeUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListeUtilisateur dialog = new ListeUtilisateur(new javax.swing.JFrame(), true);
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

    private void miseàjourlisteut() {
        //Récupérons de la liste de tous les clients
        int taille = IHM_table_utilisateur.getRowCount();
        Query req = dao.em().createQuery("SELECT c FROM Utilisateur c ");
        listeUtilisateur = req.getResultList();

        if (pointonclient < 20) {
            for (Utilisateur fred : listeUtilisateur) {
                IHM_table_utilisateur.setValueAt(fred.getId(), pointonclient, 0);
                IHM_table_utilisateur.setValueAt(fred.getNomut(), pointonclient, 1);
                 // IHM_table_utilisateur.setValueAt(fred.getPrix(), pointonclient, 2);
                //  IHM_table_utilisateur.setValueAt(fred.getQuantite(), pointonclient, 3);
                //pointonclient ++ ;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Taille maximum dépassé");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IHM_Imprimer;
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
    private javax.swing.JButton IHM_NouveauEnregistrement;
    private javax.swing.JButton IHM_Quitter;
    private javax.swing.JMenuItem IHM_contacts;
    private javax.swing.JMenuItem IHM_contenuaide;
    private javax.swing.JPanel IHM_panel_listeclient;
    private javax.swing.JTable IHM_table_utilisateur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
