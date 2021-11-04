import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essais coins arrondis") ;
    setSize (350, 100) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    int larg = 80, haut = 50 ;
    g.translate (20, 10) ; g.drawRoundRect (0, 0, larg, haut, 10, 10) ;
    g.translate (100, 0) ; g.drawRoundRect (0, 0, larg, haut, 40, 25) ;
    g.translate (100, 0) ; g.drawRoundRect (0, 0, larg, haut, larg, haut) ;
  }
}
public class Lignes2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



