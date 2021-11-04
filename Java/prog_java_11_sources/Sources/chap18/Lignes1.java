import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essais lignes") ;
    setSize (300, 150) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    g.drawRect  (20,  10,  60, 40) ;
    g.drawLine  (20, 100, 150, 20) ;
    g.drawOval (130,  60, 110, 50) ;
  }
}
public class Lignes1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



