import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.event.* ;

class MaFenetre extends JFrame implements ActionListener, ItemListener,
                                          FocusListener
{ static public final String[] nomCouleurs
                      = {"rouge",   "vert",      "jaune",      "bleu"} ;
  static public final Color[] couleurs
                      = {Color.red, Color.green, Color.yellow, Color.blue} ;
  public MaFenetre ()
  { setTitle ("FIGURES") ;
    setSize (450, 200) ;
    Container contenu = getContentPane() ;
       /*** paneau pour les dessins ***/
    panDes = new PaneauDessin() ;
    contenu.add(panDes) ;
    panDes.setBackground(Color.cyan) ;  // paneau initialement bleu
       /*** paneau pour les commandes ***/
    panCom = new JPanel() ;
    contenu.add (panCom, "South") ;
         /* choix couleur */
    comboCoulFond = new JComboBox (nomCouleurs) ;
    panCom.add(comboCoulFond) ;
    comboCoulFond.addItemListener (this) ;
         /* choix dimensions */
    JLabel dim = new JLabel ("DIMENSIONS") ;
    panCom.add (dim) ;
    txtLargeur = new JTextField ("50", 5) ;
    txtLargeur.addActionListener (this) ;
    txtLargeur.addFocusListener  (this) ;
    panCom.add (txtLargeur) ;
    txtHauteur = new JTextField ("20", 5) ;
    panCom.add (txtHauteur) ;
    txtHauteur.addActionListener (this) ;
    txtHauteur.addFocusListener (this) ;
         /* choix formes */
    cOvale = new JCheckBox ("Ovale") ;
    panCom.add (cOvale) ;
    cOvale.addActionListener (this) ;
    cRectangle = new JCheckBox ("Rectangle") ;
    panCom.add (cRectangle) ;
    cRectangle.addActionListener (this) ;
  }
  public void actionPerformed (ActionEvent ev)
  { if (ev.getSource() == txtLargeur) setLargeur() ;
    if (ev.getSource() == txtHauteur) setHauteur() ;
    if (ev.getSource() == cOvale)     panDes.setOvale(cOvale.isSelected()) ;
    if (ev.getSource() == cRectangle) panDes.setRectangle(cRectangle.isSelected()) ;
    panDes.repaint() ;
  }
  public void focusLost   (FocusEvent e)
  { if (e.getSource() == txtLargeur)
    { setLargeur() ;
      System.out.println ("perte focus largeur") ;
      panDes.repaint() ;
    }
    if (e.getSource() == txtHauteur)
    { setHauteur() ;
      panDes.repaint() ;
    }
  }
  public void focusGained (FocusEvent e)
  {}
  private void setLargeur()
  { String ch = txtLargeur.getText() ;
    System.out.println ("largeur " + ch) ;
    panDes.setLargeur (Integer.parseInt(ch)) ;
  }
  private void setHauteur()
  { String ch = txtHauteur.getText() ;
    System.out.println ("hauteur " + ch) ;
    panDes.setHauteur (Integer.parseInt(ch)) ;
  }
  public void itemStateChanged(ItemEvent e)
  { String couleur = (String)comboCoulFond.getSelectedItem() ;
    panDes.setCouleur (couleur) ;
  }
  private PaneauDessin panDes ;
  private JPanel panCom ;
  private JComboBox comboCoulFond ;
  private JTextField txtLargeur, txtHauteur ;
  private JCheckBox cOvale, cRectangle ;
}

class PaneauDessin extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    if (ovale)     g.drawOval (10, 10, 10 + largeur, 10 + hauteur) ;
    if (rectangle) g.drawRect (10, 10, 10 + largeur, 10 + hauteur) ;
  }
  public void setRectangle(boolean b) { rectangle = b ; }
  public void setOvale(boolean b)     { ovale = b ;  }
  public void setLargeur (int l) { largeur = l ; }
  public void setHauteur (int h) { hauteur = h ; }
  public void setCouleur (String c)
  {   for (int i = 0 ; i<MaFenetre.nomCouleurs.length ; i++)
        if (c == MaFenetre.nomCouleurs[i]) setBackground (MaFenetre.couleurs[i]) ;
  }
  private boolean rectangle = false, ovale = false ;
  private int largeur=50, hauteur=50 ;
}

public class Formes
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}


