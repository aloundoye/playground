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
  { System.out.println ("mouseClicked en  " + e.getX() + " " + e.getY()) ;
  }
  public void mousePressed (MouseEvent e)
  { System.out.println ("mousePressed en  " + e.getX() + " " + e.getY()) ;
  }
  public void mouseReleased (MouseEvent e)
  { System.out.println ("mouseReleased en " + e.getX() + " " + e.getY() ) ;
  }
  public void mouseEntered (MouseEvent e) {}
  public void mouseExited (MouseEvent e)  {}
}
public class Souris1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

