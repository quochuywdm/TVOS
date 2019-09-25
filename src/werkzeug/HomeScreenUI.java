package werkzeug;

import javax.swing.DefaultListModel;
import java.awt.Dimension;
import java.io.File;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	
    // Variables declaration - do not modify     
    
    private javax.swing.JLabel _aktuelleChanelLabel;
    private javax.swing.JPanel _aktuelleInhalt;
    private javax.swing.JList<String> _kanalListe;
    private javax.swing.JLabel _statusLabel;
    private javax.swing.JScrollPane jScrollPane1;
    
    JButton _homeButton;
    JButton _backButton;
    JButton _nextButton;
    // End of variables declaration                
    

    /**
     * Konstruktor
     */
    public HomeScreenUI() {
        setPreferredSize(new Dimension(700, 500));
        setResizable(false);
        initComponents();
        
        zeigeAktuelleInhalt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	// Aktuelle Chanel
    	_aktuelleChanelLabel = new javax.swing.JLabel();
    	_aktuelleChanelLabel.setText("aktuelle Kanal ist:");
    	
    	// Aktuelle Inhalt
    	_aktuelleInhalt = new javax.swing.JPanel();
    	
    	

       
        
        //Chanel Liste
        _kanalListe = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(_kanalListe);
        _kanalListe.setModel(new DefaultListModel());
        
        //Status Label
        _statusLabel = new javax.swing.JLabel();
        _statusLabel.setText("Status:");
        

        //Die Buttons
        _homeButton = new JButton("Home");
        _backButton = new JButton("back");
        _nextButton = new JButton("Next");
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        gruppeDieKomponenten();
    }

    public void gruppeDieKomponenten()
    {
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
                          .addComponent(_nextButton))
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
                      .addComponent(_nextButton)
                      .addComponent(_backButton))
                  .addContainerGap(32, Short.MAX_VALUE))
      );
      getContentPane().setLayout(layout);

      pack();
    }
public javax.swing.JList<String> get_kanalListe()
    {
        return _kanalListe;
    }

	public javax.swing.JPanel get_aktuelleInhalt() {
		return _aktuelleInhalt;
	}

	public void set_aktuelleInhalt(javax.swing.JPanel _aktuelleInhalt) {
		this._aktuelleInhalt = _aktuelleInhalt;
	}
	
	private void zeigeAktuelleInhalt()
	  {
	  	
//	  	ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Users/quochuy/Downloads/maxresdefault.jpg"));
	  	File file = new File("Users/quochuy/Downloads/maxresdefault.jpg");
	  	ImageIcon imageIcon = new ImageIcon(file.getName());
	  	JLabel label = new JLabel(imageIcon);
	  	
	  	_aktuelleInhalt.add(label);
	  	System.out.println("da show hinh");
	  	
	  	JLabel label2 = new JLabel();
	  	label2.setText("cai lon");
	  	
	  	_aktuelleInhalt.add(label2);
	  	_aktuelleInhalt.add(_statusLabel);
	  	
	  }
}

