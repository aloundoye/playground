import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
class FenMenu extends JFrame
{ public FenMenu ()
  { setTitle ("Exemple de menu surgissant") ;
    setSize (400, 120) ;
       /* creation menu surgissant Couleur et ses options Rouge et Vert */
    formes = new JPopupMenu () ;
    arrondi = new JMenu ("Arrondi") ;
    formes.add(arrondi) ;
    cercle = new JMenuItem ("Cercle") ;
    arrondi.add(cercle) ;
    ovale = new JMenuItem ("Ovale") ;
    arrondi.add(ovale) ;
    rectangle = new JMenuItem ("Rectangle") ;
    formes.add(rectangle) ;
    addMouseListener (new MouseAdapter()
      { public void mouseReleased (MouseEvent e)
        {  if (e.isPopupTrigger())
             formes.show (e.getComponent(), e.getX(), e.getY()) ;
        }
      } ) ;
  }
  private JPopupMenu formes ;
  private JMenu arrondi ;
  private JMenuItem cercle, ovale, rectangle ;
}
public class Compos2
{ public static void main (String args[])
  { FenMenu fen = new FenMenu() ;
    fen.setVisible(true) ;
  }
}

