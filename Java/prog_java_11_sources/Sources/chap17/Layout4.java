import javax.swing.* ;
import java.awt.* ;

class MaFenetre extends JFrame
{ public static int NBOUTONS = 10 ;
  public MaFenetre ()
  { setTitle ("Exemple GridLayout") ;
    setSize (350, 180) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new GridLayout(4, 3, 6, 4)) ;
    boutons = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)
    { boutons[i] = new JButton ("Bouton " + i) ;
      contenu.add(boutons[i]) ;
    }
  }
  private JButton boutons[] ;
}
public class Layout4
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

