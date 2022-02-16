
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thoar
 */
public class JeuMemory extends javax.swing.JFrame {

    private LesJoueurs joueurs ;
    private LesPersonnages persos ;
   

    /*
     * Creates new form JeuMemory
     */
    public JeuMemory() {
        initComponents();
        this.persos = new LesPersonnages();
        this.joueurs = new LesJoueurs();
        Joueur j=new Joueur("Lara", "epiques");
        j.setPhoto(new ImageIcon(getClass().getResource("/img/lara.jpg")));
        this.joueurs.ajouteJoueur(j);
        j=new Joueur("Jack", "rares");
        j.setPhoto(new ImageIcon(getClass().getResource("/img/jack.png")));
        this.joueurs.ajouteJoueur(j);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JScrollp = new javax.swing.JScrollPane();
        Edition = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        NbPersosT = new javax.swing.JLabel();
        NbPersosR = new javax.swing.JLabel();
        JC = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Demarrer = new javax.swing.JButton();
        Recommencer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Joueur = new javax.swing.JMenuItem();
        Carte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        Panneau.setLayout(new java.awt.GridLayout(4, 5));
        Panneau.add(jButton1);
        Panneau.add(jButton2);
        Panneau.add(jButton3);
        Panneau.add(jButton4);
        Panneau.add(jButton5);
        Panneau.add(jButton6);
        Panneau.add(jButton7);
        Panneau.add(jButton8);
        Panneau.add(jButton9);
        Panneau.add(jButton10);
        Panneau.add(jButton11);
        Panneau.add(jButton12);
        Panneau.add(jButton13);
        Panneau.add(jButton14);
        Panneau.add(jButton15);
        Panneau.add(jButton16);
        Panneau.add(jButton17);
        Panneau.add(jButton18);
        Panneau.add(jButton19);
        Panneau.add(jButton20);

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        JScrollp.setPreferredSize(new java.awt.Dimension(226, 226));

        Edition.setColumns(20);
        Edition.setRows(5);
        Edition.setPreferredSize(new java.awt.Dimension(224, 227));
        JScrollp.setViewportView(Edition);

        jPanel2.add(JScrollp, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));

        NbPersosT.setText("Nb de personnages trouvés :");
        jPanel4.add(NbPersosT);

        NbPersosR.setText("Nb de personnes restants : ");
        jPanel4.add(NbPersosR);

        JC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JC.setText("C'est à Lara de jouer !");
        jPanel4.add(JC);

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        Demarrer.setText("Démarrer");
        jPanel5.add(Demarrer);

        Recommencer.setText("Recommencer");
        Recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecommencerActionPerformed(evt);
            }
        });
        jPanel5.add(Recommencer);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jMenu1.setText("Paramètres");

        jMenuItem1.setText("Options");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualiser");

        Joueur.setText("Joueur");
        Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoueurActionPerformed(evt);
            }
        });
        jMenu2.add(Joueur);

        Carte.setText("Carte");
        Carte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarteActionPerformed(evt);
            }
        });
        jMenu2.add(Carte);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecommencerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecommencerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        OptionDlg od = new OptionDlg(this,true);
        od.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarteActionPerformed
        // TODO add your handling code here:
        BatailleDlg bdl = new BatailleDlg(this,true);
        bdl.setVisible(true);
    }//GEN-LAST:event_CarteActionPerformed

    private void JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoueurActionPerformed
       
       VisuJoueursDlg visu = new VisuJoueursDlg(this,true,joueurs);
       visu.setVisible(true);
    }//GEN-LAST:event_JoueurActionPerformed

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
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Carte;
    private javax.swing.JButton Demarrer;
    private javax.swing.JTextArea Edition;
    private javax.swing.JLabel JC;
    private javax.swing.JScrollPane JScrollp;
    private javax.swing.JMenuItem Joueur;
    private javax.swing.JLabel NbPersosR;
    private javax.swing.JLabel NbPersosT;
    private javax.swing.JPanel Panneau;
    private javax.swing.JButton Recommencer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
