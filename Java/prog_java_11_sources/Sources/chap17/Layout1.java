import javax.swing.* ;
import java.awt.* ;

class MaFenetre extends JFrame
{ public static int NBOUTONS = 5 ;
  public MaFenetre ()
  { setTitle ("Exemple BorderLayout") ;
    setSize (300, 180) ;
    Container contenu = getContentPane() ;
    boutons = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)
    { boutons[i] = new JButton ("Bouton " + i) ;
    }
    contenu.add(boutons[0]) ;      // au centre par defaut
    contenu.add(boutons[1], BorderLayout.NORTH) ;
    contenu.add(boutons[2], BorderLayout.SOUTH) ;
    contenu.add(boutons[3], BorderLayout.WEST) ;
    contenu.add(boutons[4], BorderLayout.EAST) ;
  }
  private JButton boutons[] ;
}
public class Layout1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

