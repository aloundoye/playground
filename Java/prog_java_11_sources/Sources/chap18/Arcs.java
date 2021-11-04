import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essais arcs") ;
    setSize (400, 120) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    int r = 50 ;
    g.translate (10,20) ;
    g.drawArc (0, 0, 2*r, 2*r, 45, 135);
    g.translate (2*r+20, 0) ;
    g.drawArc (0, 0, 2*r, r, 30, 210) ;
    g.translate (2*r+20, 0) ;
    g.drawArc (0, 0, 2*r, r, 45, -210) ;
  }
}
public class Arcs
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



