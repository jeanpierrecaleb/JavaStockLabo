/*
 To change this license header, choose License Headers in Project Properties.
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
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import org.lab.dao.Dao;
import org.lab.entites.Adresse;
import org.lab.entites.ClientEntite;

/**
 *
 * @author J-P
 */
public class GestionClient extends javax.swing.JDialog {

    //Attributs
    private Dao dao = new Dao();
    Adresse adresse = new Adresse();
    private ClientEntite client = new ClientEntite();
    private List<ClientEntite> listeClient = new ArrayList<>();
    private Vector vecteur = new Vector();

    //méthode de reload base
    public void miseàjourclient() {
        //On vide le vecteur 
        vecteur.clear();
        //renvoie du vecteur vide à la liste
        IHM_liste.setListData(vecteur);
        //Rechercher tous les clients dans la base de données
        Query req = dao.em().createQuery("SELECT p from ClientEntite p");
//Rcupéronsle résulltat de la requete
        listeClient = req.getResultList();
        //On affiche
        for (ClientEntite c : listeClient) {
            //On remplie le vecteur 
            vecteur.add(c.getId() + "- " + c.getNom() + " " + c.getPrenom());
            //Vou devez remplir la liste
            IHM_liste.setListData((vecteur));
        }
    }

    /**
     * Creates new form GestionClient
     */
    public GestionClient(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        //
        IHM_supprimer.setVisible(false);
        IHM_modifier.setVisible(false);
        miseàjourclient();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IHM_nom = new javax.swing.JTextField();
        IHM_prenom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IHM_pays = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IHM_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IHM_telephone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IHM_ges_Ajouter = new javax.swing.JButton();
        IHM_ges_annuler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        IHM_liste = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        IHM_ges_quitter = new javax.swing.JButton();
        IHM_naissance = new com.toedter.calendar.JDateChooser();
        IHM_modifier = new javax.swing.JButton();
        IHM_supprimer = new javax.swing.JButton();
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

        jLabel1.setText("Nom");

        jLabel2.setText("Prenom");

        jLabel3.setText("Pays");

        jLabel4.setText("Email");

        jLabel5.setText("Telephone");

        jLabel6.setText("Naissance");

        IHM_ges_Ajouter.setText("Ajouter");
        IHM_ges_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ges_AjouterActionPerformed(evt);
            }
        });

        IHM_ges_annuler.setText("Annuler");
        IHM_ges_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ges_annulerActionPerformed(evt);
            }
        });

        IHM_liste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IHM_listeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(IHM_liste);

        jLabel7.setBackground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("GESTION DES CLIENTS");

        IHM_ges_quitter.setText("Quitter");
        IHM_ges_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_ges_quitterActionPerformed(evt);
            }
        });

        IHM_modifier.setText("Modifier");
        IHM_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_modifierActionPerformed(evt);
            }
        });

        IHM_supprimer.setText("Supprimer");
        IHM_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IHM_supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(IHM_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(IHM_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(IHM_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(IHM_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(IHM_email, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IHM_supprimer)
                                            .addComponent(IHM_ges_annuler)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(IHM_naissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IHM_ges_quitter)
                                                .addComponent(IHM_modifier))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(IHM_ges_Ajouter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IHM_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IHM_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IHM_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IHM_email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IHM_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IHM_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IHM_ges_annuler)
                            .addComponent(IHM_modifier))))
                .addGap(8, 8, 8)
                .addComponent(IHM_ges_Ajouter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IHM_ges_quitter)
                    .addComponent(IHM_supprimer))
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 690, 490);

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

    private void IHM_ges_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ges_quitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_IHM_ges_quitterActionPerformed

    private void IHM_ges_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ges_annulerActionPerformed
        // TODO add your handling code here:
        initChamp();
        IHM_modifier.setVisible(false);
        IHM_supprimer.setVisible(false);
        IHM_ges_Ajouter.setVisible(true);
    }//GEN-LAST:event_IHM_ges_annulerActionPerformed

    private void IHM_ges_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_ges_AjouterActionPerformed
        // TODO add your handling code here:
if (IHM_nom.getText().isEmpty() || IHM_prenom.getText().isEmpty() || IHM_naissance.getDate()==null || IHM_email.getText().isEmpty()){
     JOptionPane.showMessageDialog(this, "Veuillez remplir toutes les cases requises ");
}else{
        dao.init();
        adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
        client.setNom(IHM_nom.getText());
        client.setPrenom(IHM_prenom.getText());
        client.setAdresse(adresse);
        //
        dao.prepare(client);
        dao.save();
        dao.close();
        //
        JOptionPane.showMessageDialog(this, "Insertion du client bien fait ");

        initChamp();
        miseàjourclient();
        }
    }//GEN-LAST:event_IHM_ges_AjouterActionPerformed

    private void IHM_listeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IHM_listeMouseClicked
        // TODO add your handling code here:
        String ligne = (String) IHM_liste.getSelectedValue();

        char at1 = ligne.charAt(0);
        char at2 = ligne.charAt(1);

        int id1 = Character.getNumericValue(at1);
        int id2 = Character.getNumericValue(at2) + 10;

        if (id1 < 10) {

            char charac = ligne.charAt(0);
            // int id = Character.getNumericValue(charac);
            Query req1 = dao.em().createQuery("SELECT p FROM ClientEntite p WHERE p.id=:id");
            req1.setParameter("id", id1);
            client = (ClientEntite) req1.getSingleResult();
            //Affichage de les éléments récupéré pour les modifiés
            IHM_nom.setText(client.getNom());
            IHM_prenom.setText(client.getPrenom());
            IHM_naissance.setDate(client.getAdresse().getNaissance());
            IHM_pays.setText(client.getAdresse().getPays());
            IHM_telephone.setText(client.getAdresse().getTelephone());
            IHM_email.setText(client.getAdresse().getEmail());
            //Afficher les boutons supprimer et modifier à la sélection du client dans la liste

        } else {
            //char charac = ligne.charAt(1);
            //int id = Character.getNumericValue(charac);
            Query req1 = dao.em().createQuery("SELECT p FROM ClientEntite p WHERE p.id=:id");
            req1.setParameter("id", id2);
            client = (ClientEntite) req1.getSingleResult();
            //Affichage de les éléments récupéré pour les modifiés
            IHM_nom.setText(client.getNom());
            IHM_prenom.setText(client.getPrenom());
            IHM_naissance.setDate(client.getAdresse().getNaissance());
            IHM_pays.setText(client.getAdresse().getPays());
            IHM_telephone.setText(client.getAdresse().getTelephone());
            IHM_email.setText(client.getAdresse().getEmail());
            //Afficher les boutons supprimer et modifier à la sélection du client dans la liste

        }
        IHM_modifier.setVisible(true);
        IHM_supprimer.setVisible(true);
        IHM_ges_Ajouter.setVisible(false);
    }//GEN-LAST:event_IHM_listeMouseClicked

    private void IHM_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_modifierActionPerformed
        // TODO add your handling code here:
        String ligne = (String) IHM_liste.getSelectedValue();
        char at1 = ligne.charAt(0);
        char at2 = ligne.charAt(1);
        int id1 = Character.getNumericValue(at1);
        int id2 = Character.getNumericValue(at2) + 10;

        if (id1 < 10) {
            //Liste < 10
        /*dao.init();
             adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
             client.setNom(IHM_nom.getText());
             client.setPrenom(IHM_prenom.getText());
             client.setAdresse(adresse);
             dao.update(client);
             dao.save();
             miseàjourclient();*/
            //Liste >10
            Query req3 = dao.em().createQuery("SELECT c FROM ClientEntite c WHERE c.id=:id");
            req3.setParameter("id", id1);
            client = (ClientEntite) req3.getSingleResult();
            dao.init();
            adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
            client.setNom(IHM_nom.getText());
            client.setPrenom(IHM_prenom.getText());
            client.setAdresse(adresse);
            //
            dao.update(client);
            dao.save();
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Modification des données du client bien fait ");

            initChamp();
            miseàjourclient();
        } else {
            Query req4 = dao.em().createQuery("SELECT c FROM ClientEntite c WHERE c.id=:id");
            req4.setParameter("id", id2);
            client = (ClientEntite) req4.getSingleResult();
            dao.init();
            adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
            client.setNom(IHM_nom.getText());
            client.setPrenom(IHM_prenom.getText());
            client.setAdresse(adresse);
            //
            dao.update(client);
            dao.save();
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Modification des données du  client bien fait ");

            initChamp();
            miseàjourclient();

        }
        IHM_modifier.setVisible(false);
        IHM_supprimer.setVisible(false);
        IHM_ges_Ajouter.setVisible(true);

    }//GEN-LAST:event_IHM_modifierActionPerformed

    private void IHM_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IHM_supprimerActionPerformed
        // TODO add your handling code here:
        //Last méthode  
       /* String ligne = (String) IHM_liste.getSelectedValue();
        char charac = ligne.charAt(0);
        int id = Character.getNumericValue(charac);
        Query req = dao.em().createQuery("SELECT p FROM ClientEntite p WHERE p.id=:id");
        req.setParameter("id", id);
        client = (ClientEntite) req.getSingleResult();

        dao.init();
        dao.delete(client);
        dao.close();
        miseàjourclient();
        initChamp();*/
        //NEW METHODE
        String ligne = (String) IHM_liste.getSelectedValue();
        char at1 = ligne.charAt(0);
        char at2 = ligne.charAt(1);
        int id1 = Character.getNumericValue(at1);
        int id2 = Character.getNumericValue(at2) + 10;

        if (id1 < 10) {
            //Liste < 10
        
            
            Query req3 = dao.em().createQuery("SELECT c FROM ClientEntite c WHERE c.id=:id");
            req3.setParameter("id", id1);
            client = (ClientEntite) req3.getSingleResult();
            dao.init();
            adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
            client.setNom(IHM_nom.getText());
            client.setPrenom(IHM_prenom.getText());
            client.setAdresse(adresse);
            //
            dao.delete(client);
           
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Suppression du client bien fait ");

            initChamp();
            miseàjourclient();
        } else {//Liste >10
            Query req4 = dao.em().createQuery("SELECT c FROM ClientEntite c WHERE c.id=:id");
            req4.setParameter("id", id2);
            client = (ClientEntite) req4.getSingleResult();
            dao.init();
            adresse = new Adresse(IHM_pays.getText(), IHM_email.getText(), IHM_telephone.getText(), IHM_naissance.getDate());
            client.setNom(IHM_nom.getText());
            client.setPrenom(IHM_prenom.getText());
            client.setAdresse(adresse);
            //
            dao.delete(client);
            
            dao.close();
            //
            JOptionPane.showMessageDialog(this, "Suppression client bien fait ");

            initChamp();
            miseàjourclient();

        }
        IHM_modifier.setVisible(false);
        IHM_supprimer.setVisible(false);
        IHM_ges_Ajouter.setVisible(true);

        
        
    }//GEN-LAST:event_IHM_supprimerActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionClient dialog = new GestionClient(new javax.swing.JFrame(), true);
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

    //méthode annuler des champ
    public void initChamp() {
        IHM_nom.setText("");
        IHM_prenom.setText("");
        IHM_email.setText("");
        IHM_telephone.setText("");
        IHM_naissance.setDate(new Date());
        IHM_pays.setText("");

    }
//Mise à jour de la 


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JMenuItem IHM_contacts;
    private javax.swing.JMenuItem IHM_contenuaide;
    private javax.swing.JTextField IHM_email;
    private javax.swing.JButton IHM_ges_Ajouter;
    private javax.swing.JButton IHM_ges_annuler;
    private javax.swing.JButton IHM_ges_quitter;
    private javax.swing.JList IHM_liste;
    private javax.swing.JButton IHM_modifier;
    private com.toedter.calendar.JDateChooser IHM_naissance;
    private javax.swing.JTextField IHM_nom;
    private javax.swing.JTextField IHM_pays;
    private javax.swing.JTextField IHM_prenom;
    private javax.swing.JButton IHM_supprimer;
    private javax.swing.JTextField IHM_telephone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
