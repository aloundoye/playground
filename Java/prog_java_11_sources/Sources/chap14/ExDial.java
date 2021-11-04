import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame implements ActionListener
{ static public final String[] nomCouleurs = {"rouge", "vert", "jaune", "bleu"} ;
  static public final Color[] couleurs = {Color.red, Color.green, Color.yellow, Color.blue} ;
  public MaFenetre ()
  { setTitle ("FIGURES AVEC BOITE DIALOGUE") ;
    setSize (450, 200) ;
    Container contenu = getContentPane() ;
       /* paneau pour les dessins */
    pan = new PaneauDessin() ;
    contenu.add(pan) ;
       /* bouton pour lancer la boite de dialogue */
    lanceDial = new JButton ("MODIFICATIONS") ;
    contenu.add (lanceDial, "South") ;
    lanceDial.addActionListener (this) ;
  }
  public void actionPerformed (ActionEvent ev)
  { if (dialogue == null)
    { dialogue = new Dialogue(this) ;
      infos = new Infos ();
    }
       /* recup informations courantes dans l'objet infos */
    infos.largeur = pan.getLargeur() ;
    infos.hauteur = pan.getHauteur() ;
    infos.rectangle = pan.getRectangle() ;
    infos.ovale = pan.getOvale() ;
    infos.nomCouleur = pan.getNomCouleur() ;
       /* lancement dialogue */
    dialogue.lanceDial(infos) ;
       /* prise en compte nouvelles informations */
    pan.setLargeur (infos.largeur) ;
    pan.setHauteur (infos.hauteur) ;
    pan.setRectangle (infos.rectangle) ;
    pan.setOvale (infos.ovale) ;
    pan.setCouleur (infos.nomCouleur) ;
    pan.repaint() ;
  }
  private PaneauDessin pan ;
  private JButton lanceDial ;
  private Dialogue dialogue ;
  private Infos infos ;
}
class Dialogue extends JDialog  implements ActionListener
{ public Dialogue(JFrame parent)
  {  super (parent, "COULEURS, FORMES, TAILLES", true) ;
     setSize (420, 150) ;
     Container contenu = getContentPane() ;
     okBouton = new JButton ("OK") ;
     contenu.add(okBouton) ;
     contenu.setLayout(new FlowLayout());
     okBouton.addActionListener(this) ;
     cancelBouton = new JButton ("Cancel") ;
     contenu.add(cancelBouton) ;
     cancelBouton.addActionListener(this) ;
         /* choix couleur */
     comboCoulFond = new JComboBox (MaFenetre.nomCouleurs) ;
     contenu.add(comboCoulFond) ;
         /* choix dimensions */
     JLabel dim = new JLabel ("DIMENSIONS") ;
     contenu.add (dim) ;
     txtLargeur = new JTextField (5) ;
     contenu.add (txtLargeur) ;
     txtHauteur = new JTextField (5) ;
     contenu.add (txtHauteur) ;
         /* choix formes */
     cOvale = new JCheckBox ("Ovale") ;
     contenu.add (cOvale) ;
     cRectangle = new JCheckBox ("Rectangle") ;
     contenu.add (cRectangle) ;
  }
  public void lanceDial(Infos infos)
  {   /* placer infos dans controles */
    txtLargeur.setText(""+infos.largeur) ;
    txtHauteur.setText (""+infos.hauteur) ;
    cOvale.setSelected (infos.ovale) ;
    cRectangle.setSelected (infos.rectangle) ;
    comboCoulFond.setSelectedItem (infos.nomCouleur) ;
      /* lancer le dialogue */
    ok = false ;
    setVisible (true) ;
     /* si ok on recupere les informations du dialogue */
    if (ok) { infos.largeur = Integer.parseInt(txtLargeur.getText()) ;
              infos.hauteur = Integer.parseInt(txtHauteur.getText()) ;
              infos.rectangle = cRectangle.isSelected() ;
              infos.ovale = cOvale.isSelected() ;
              infos.nomCouleur = (String)comboCoulFond.getSelectedItem() ;
            }
  }
  public void actionPerformed (ActionEvent e)
  { if (e.getSource() == okBouton)
      { ok = true ;
        setVisible(false) ;
      }
    if (e.getSource() == cancelBouton)
       setVisible(false) ;
  }
  private JButton okBouton, cancelBouton ;
  private boolean ok = false ;
  private JComboBox comboCoulFond ;
  private JTextField txtLargeur, txtHauteur ;
  private JCheckBox cOvale, cRectangle ;
}
class Infos
{ public boolean ovale, rectangle ;
  public int largeur, hauteur ;
  public String nomCouleur ;
}

class PaneauDessin extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    if (ovale)     g.drawOval (10, 10, 10 + largeur, 10 + hauteur) ;
    if (rectangle) g.drawRect (10, 10, 10 + largeur, 10 + hauteur) ;
  }
  public void setRectangle(boolean b) { rectangle = b ; }
  public boolean getRectangle ()      { return rectangle ; }
  public void setOvale(boolean b)     { ovale = b ;  }
  public boolean getOvale ()          { return ovale ; }
  public void setLargeur (int l)      { largeur = l ; }
  public int getLargeur ()            { return largeur ; }
  public void setHauteur (int h)      { hauteur = h ; }
  public int getHauteur ()            { return hauteur ; }
  public void setCouleur (String c)
  { for (int i = 0 ; i<MaFenetre.nomCouleurs.length ; i++)
      if (c == MaFenetre.nomCouleurs[i]) setBackground (MaFenetre.couleurs[i]) ;
    nomCouleur = c ;
  }
  public String getNomCouleur ()      { return nomCouleur ; }
  private boolean rectangle = false, ovale = false ;
  private int largeur=50, hauteur=50 ;
  private Color couleur ;
  private String nomCouleur = MaFenetre.nomCouleurs[0] ;
}

public class ExDial
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

