import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essai texte") ;
    setSize (300, 150) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    int x = 20, y = 30 ;
    String ch1 = "bonjour" ;
    String ch2 = "monsieur" ; 
    g.drawString (ch1, x, y) ;
    FontMetrics fm = g.getFontMetrics() ;
    y += fm.getHeight() ;
    g.drawString (ch2, x, y) ;
  }
}
public class PremTxt2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



