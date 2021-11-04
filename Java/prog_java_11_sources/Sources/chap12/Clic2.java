import javax.swing.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame implements MouseListener
{ MaFenetre ()    // constructeur
  { setTitle ("Gestion de clics") ;
    setBounds (10, 20, 300, 200) ;
    addMouseListener (this) ;   // la fenetre sera son propre écouteur
                                // d'évènements souris
  }
  public void mouseClicked(MouseEvent ev)
  { int x = ev.getX() ;
    int y = ev.getY() ;
    System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
  }
  public void mousePressed (MouseEvent ev) {}
  public void mouseReleased(MouseEvent ev) {}
  public void mouseEntered (MouseEvent ev) {}
  public void mouseExited  (MouseEvent ev) {}
}
public class Clic2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

