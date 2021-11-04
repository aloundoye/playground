import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
class FenMenu extends JFrame implements ActionListener
{ public FenMenu ()
  { setTitle ("Exemple de menu surgissant") ;
    setSize (400, 120) ;
       /* creation menu surgissant Couleur et ses options Rouge et Vert */
    couleur = new JPopupMenu () ;
    rouge = new JMenuItem ("Rouge") ;
    couleur.add(rouge) ;
    rouge.addActionListener (this) ;
    vert = new JMenuItem ("Vert") ;
    couleur.add(vert) ;
    vert.addActionListener (this) ;
    addMouseListener (new MouseAdapter()
        { public void mouseReleased (MouseEvent e)
          {  if (e.isPopupTrigger())
              couleur.show (e.getComponent(), e.getX(), e.getY()) ;
          }
        } ) ;
  }
  public void actionPerformed (ActionEvent e)
  { Object source = e.getSource() ;
    System.out.println ("Action avec chaine de commande = "
                        + e.getActionCommand() ) ;
    if (source == rouge)   System.out.println ("** Action option rouge") ;
    if (source == vert)    System.out.println ("** Action option vert") ;
  }
  private JPopupMenu couleur ;
  private JMenuItem rouge, vert ;
}
public class Popup1
{ public static void main (String args[])
  { FenMenu fen = new FenMenu() ;
    fen.setVisible(true) ;
  }
}

