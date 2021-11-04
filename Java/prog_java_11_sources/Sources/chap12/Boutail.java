import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class Fen2Boutons extends JFrame
{ final int NBOUTONS = 4 ;
  public Fen2Boutons ()
  { setTitle ("Modif taille boutons") ;
    setSize (300, 150) ;
    Container contenu = getContentPane() ;
    contenu.setLayout(new FlowLayout()) ;
    boutons = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)
      { boutons[i] = new JButton ("NUM "+i) ;
        contenu.add(boutons[i]) ;
      }
  }
  public void setTaillBout (int num, int l, int h)
  { boutons[num].setPreferredSize(new Dimension(l, h)) ;
    boutons[num].revalidate() ;
  }
  private JButton boutons[] ;
}
public class Boutail
{ public static void main (String args[])
  { Fen2Boutons fen = new Fen2Boutons() ;
    fen.setVisible(true) ;
    int num, l, h ;
    while (true)
    { System.out.print ("num bouton : ") ;
      num = Clavier.lireInt() ;
      System.out.print ("larg bouton : ") ;
      l = Clavier.lireInt() ;
      System.out.print ("haut bouton : ") ;
      h = Clavier.lireInt() ;
      fen.setTaillBout (num, l, h) ;
    }
  }
}



