import javax.swing.* ;
import java.awt.* ;

class MaFenetre extends JFrame
{ public static int NBOUTONS = 8 ;
  public MaFenetre ()
  { setTitle ("Exemple FlowLayout") ;
    setSize (350, 180) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout(FlowLayout.CENTER, 10, 5)) ;
    boutons = new JButton[NBOUTONS] ;
    int n = 1 ;
    for (int i=0 ; i<NBOUTONS ; i++)
    { boutons[i] = new JButton ("Bouton " + n) ;
      n *= 10 ;
      contenu.add(boutons[i]) ;
    }
  }
  private JButton boutons[] ;
}
public class Layout2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

