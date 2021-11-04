import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
public class ApMenuAc extends JApplet implements ActionListener
{ static public final String[] nomCouleurs =
                         {"rouge",    "vert",       "jaune",      "bleu"} ;
  static public final Color[] couleurs =
                         {Color.red,   Color.green, Color.yellow, Color.blue} ;
  static public final String[] nomIcones  =
                         {"rouge.gif", "vert.gif",  "jaune.gif",  "bleu.gif"} ;
  public void init()
  { Container contenu = getContentPane() ;
       /* creation paneau pour les dessins */
    pan = new Paneau() ;
    contenu.add(pan) ;
    pan.setBackground(Color.cyan) ;

    int nbCouleurs = nomCouleurs.length ;
       /* creation des actions */
    actions = new ActionCouleur [nbCouleurs] ;
    for (int i=0 ; i<nbCouleurs ; i++)
    { actions[i] = new ActionCouleur (nomCouleurs[i], couleurs[i],
                                      nomIcones[i], pan) ;
    }
       /* creation barre des menus */
    barreMenus = new JMenuBar() ;
    setJMenuBar(barreMenus) ;
       /* creation menu Couleur et ses options */
    couleur = new JMenu ("Couleur") ; couleur.setMnemonic('C') ;
    barreMenus.add(couleur) ;
    for (int i=0 ; i<nomCouleurs.length ; i++)
      couleur.add(actions[i]) ;
       /* creation menu surgissant Couleur et ses options */
    couleurSurg = new JPopupMenu () ;
    for (int i=0 ; i<nomCouleurs.length ; i++)
      couleurSurg.add(actions[i]) ;
       /* creation menu formes et ses options rectangle et ovale */
    formes = new JMenu ("Formes") ; formes.setMnemonic('F') ;
    barreMenus.add(formes) ;
    rectangle = new JCheckBoxMenuItem ("Rectangle") ;
    formes.add(rectangle) ;
    rectangle.addActionListener (this) ;
    ovale = new JCheckBoxMenuItem ("Ovale") ;
    formes.add(ovale) ;
    ovale.addActionListener (this) ;
       /* affichage menu surgissant sur clic dans fenetre */
    addMouseListener (new MouseAdapter ()
        { public void mouseReleased (MouseEvent e)
          { if (e.isPopupTrigger())
              couleurSurg.show (e.getComponent(), e.getX(), e.getY()) ;
          }
        }) ;
       /* creation menu Dimensions et ses options Hauteur et Largeur */
    dimensions = new JMenu ("Dimensions") ; dimensions.setMnemonic('D') ;
    barreMenus.add(dimensions) ;
    largeur = new JMenuItem ("Largeur") ;
    dimensions.add(largeur) ;
    largeur.addActionListener (this) ;
    hauteur = new JMenuItem ("Hauteur") ;
    dimensions.add(hauteur) ;
    hauteur.addActionListener (this) ;
      /*             creation barre d'outils couleurs                */
      /* (avec suppression textes associes et ajout de bulles d'aide */
    barreCouleurs = new JToolBar () ;
    for (int i=0 ; i<nomCouleurs.length ; i++)
    { JButton boutonCourant = barreCouleurs.add(actions[i]) ;
      boutonCourant.setText(null) ;
      boutonCourant.setToolTipText
         ((String)actions[i].getValue(Action.SHORT_DESCRIPTION)) ;
    }
    contenu.add(barreCouleurs, "North") ;
  }
  public void actionPerformed (ActionEvent e)
  { Object source = e.getSource() ;
    if (source == largeur)
    { String ch = JOptionPane.showInputDialog (this, "Largeur") ;
      pan.setLargeur (Integer.parseInt(ch)) ;
    }
    if (source == hauteur)
    { String ch = JOptionPane.showInputDialog (this, "Hauteur") ;
      pan.setHauteur (Integer.parseInt(ch)) ;
    }
    if (source == ovale)     pan.setOvale(ovale.isSelected()) ;
    if (source == rectangle) pan.setRectangle(rectangle.isSelected()) ;
    pan.repaint() ;
  }
  private JMenuBar barreMenus ;
  private JMenu couleur, dimensions, formes ;
  private JMenuItem [] itemCouleurs ;
  private JMenuItem largeur, hauteur ;
  private JCheckBoxMenuItem rectangle, ovale ;
  private JPopupMenu couleurSurg ;
  private ActionCouleur [] actions ;
  private JToolBar barreCouleurs ;
  private Paneau pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    if (ovale)     g.drawOval (10, 10, 10+largeur, 10+hauteur) ;
    if (rectangle) g.drawRect (10, 10, 10+largeur, 10+hauteur) ;
  }
  public void setRectangle (boolean trace) {rectangle = trace ; }
  public void setOvale (boolean trace)     {ovale = trace ;  }
  public void setLargeur (int l) { largeur = l ; }
  public void setHauteur (int h) { hauteur = h ; }
  public void setCouleur (Color c) { setBackground (c) ; }
  private boolean rectangle = false, ovale = false ;
  private int largeur=50, hauteur=50 ;
}
class ActionCouleur extends AbstractAction
{ public ActionCouleur (String nom, Color couleur, String nomIcone, Paneau pan)
  { putValue (Action.NAME, nom) ;
    putValue (Action.SMALL_ICON, new ImageIcon(nomIcone) ) ;
    putValue (Action.SHORT_DESCRIPTION, "Fond "+nom) ;
    this.couleur = couleur ;
    this.pan = pan ;
  }
  public void actionPerformed (ActionEvent e)
  { pan.setCouleur (couleur) ;
    pan.repaint() ;
    setEnabled(false) ;
    if (actionInactive != null) actionInactive.setEnabled(true) ;
    actionInactive = this ;
  }
  private Color couleur ;
  private Paneau pan ;
  static ActionCouleur actionInactive ;   // ne pas oublier static
}



