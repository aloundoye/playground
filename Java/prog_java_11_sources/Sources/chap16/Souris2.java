import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame implements MouseListener
{ public MaFenetre ()
  { setTitle ("Traces souris") ;
    setSize (300, 180) ;
    addMouseListener (this) ;
  }
  public void mouseClicked (MouseEvent e)
  { details ("mouseClicked  ", e) ; }
  public void mousePressed (MouseEvent e)
  { details ("mousePressed  ", e) ;
  }
  public void mouseReleased (MouseEvent e)
  { details ("mouseReleased ", e) ;
  }
  public void mouseEntered (MouseEvent e) {}
  public void mouseExited (MouseEvent e)  {}
  public static void details (String txt, MouseEvent e)
  { System.out.print (txt + e.getX() + " " + e.getY()) ;
    System.out.print ("   Ctr = " + e.getClickCount()) ;
    System.out.print ("   Boutons : ") ;
    if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0)
       System.out.print ("gauche ") ;
    if((e.getModifiers() & InputEvent.BUTTON2_MASK) != 0)
       System.out.print ("milieu ") ;
    if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)
       System.out.print ("droite ") ;
    if(e.isPopupTrigger()) System.out.print (" Popup ") ;
    System.out.println () ;
  }
}
public class Souris2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

