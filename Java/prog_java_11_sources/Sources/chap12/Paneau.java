import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Fenetre = paneau jaune") ;
    setSize (300, 150) ;
    paneau = new JPanel() ;
    getContentPane().add(paneau) ;
  }
  private JPanel paneau ;
}
public class Paneau
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}


