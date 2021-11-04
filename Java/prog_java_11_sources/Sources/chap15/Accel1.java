import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
class FenMenu extends JFrame implements ActionListener
{ public FenMenu ()
  { setTitle ("Exemple accelerateurs") ;
    setSize (300, 150) ;
       /* creation barre des menus */
    barreMenus = new JMenuBar() ;
    setJMenuBar(barreMenus) ;
       /* creation menu Couleur et ses options Rouge et Vert */
    couleur = new JMenu ("Couleur") ; couleur.setMnemonic ('C') ;
    barreMenus.add(couleur) ;
    rouge = new JMenuItem ("Rouge") ; rouge.setMnemonic ('R') ;
    rouge.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_R, InputEvent.CTRL_MASK)) ;
    couleur.add(rouge) ;
    rouge.addActionListener (this) ;
    vert = new JMenuItem ("Vert") ; vert.setMnemonic ('V') ;
    vert.setAccelerator (KeyStroke.getKeyStroke (KeyEvent.VK_V, InputEvent.CTRL_MASK)) ;
    couleur.add(vert) ;
    vert.addActionListener (this) ;
       /* creation menu Dimensions et ses options Hauteur et Largeur */
    dimensions = new JMenu ("Dimensions") ;
    barreMenus.add(dimensions) ;
    largeur = new JMenuItem ("Largeur") ;
    dimensions.add(largeur) ;
    largeur.addActionListener (this) ;
    hauteur = new JMenuItem ("Hauteur") ;
    dimensions.add(hauteur) ;
    hauteur.addActionListener (this) ;
  }
  public void actionPerformed (ActionEvent e)
  { Object source = e.getSource() ;
    System.out.println ("Action avec chaine de commande = "
                        + e.getActionCommand() ) ;
    if (source == rouge)   System.out.println ("** Action option rouge") ;
    if (source == vert)    System.out.println ("** Action option vert") ;
    if (source == largeur) System.out.println ("** Action option largeur") ;
    if (source == hauteur) System.out.println ("** Action option hauteur") ;
  }
  private JMenuBar barreMenus ;
  private JMenu couleur, dimensions ;
  private JMenuItem rouge, vert, largeur, hauteur ;
}
public class Accel1
{ public static void main (String args[])
  { FenMenu fen = new FenMenu() ;
    fen.setVisible(true) ;
  }
}

