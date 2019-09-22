package werkzeug;

import javax.swing.DefaultListModel;
import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quochuy
 */
public class HomeScreenUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreenUI
     */
    public HomeScreenUI() {
        setPreferredSize(new Dimension(700, 500));
        setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        _statusLabel = new javax.swing.JLabel();
        _aktuelleChanelLabel = new javax.swing.JLabel();
        _aktuelleInhalt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _kanalListe = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _statusLabel.setText("Status:");

        _aktuelleChanelLabel.setText("aktuelle Kanal ist:");

        javax.swing.GroupLayout _aktuelleInhaltLayout = new javax.swing.GroupLayout(_aktuelleInhalt);
        _aktuelleInhalt.setLayout(_aktuelleInhaltLayout);
        _aktuelleInhaltLayout.setHorizontalGroup(
            _aktuelleInhaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        _aktuelleInhaltLayout.setVerticalGroup(
            _aktuelleInhaltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        _kanalListe.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(_kanalListe);
        
        JButton _homeButton = new JButton("Home");
        
        JButton _backButton = new JButton("back");
        
        JButton btnNext = new JButton("Next");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28)
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(_homeButton)
                            .addGap(18)
                            .addComponent(_backButton)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(btnNext))
                        .addComponent(_aktuelleChanelLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6)
                            .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(_statusLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(_aktuelleInhalt, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                                    .addGap(18)
                                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(19)
                    .addComponent(_aktuelleChanelLabel)
                    .addGap(14)
                    .addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, Alignment.LEADING)
                        .addComponent(_aktuelleInhalt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addGap(18)
                    .addComponent(_statusLabel)
                    .addGap(18)
                    .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(_homeButton)
                        .addComponent(btnNext)
                        .addComponent(_backButton))
                    .addContainerGap(32, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(HomeScreenUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreenUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreenUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreenUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreenUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel _aktuelleChanelLabel;
    private javax.swing.JPanel _aktuelleInhalt;
    private javax.swing.JList<String> _kanalListe;
    private javax.swing.JLabel _statusLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                
    
    public javax.swing.JList<String> get_kanalListe()
    {
        return _kanalListe;
    }
}
