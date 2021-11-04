import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Remplissage de formes") ;
    setSize (550, 180) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    int larg = 80, haut = 50 ;
      /* rectangle a coins arrondis de couleur jaune, de bordure noire */
    g.translate (20, 10) ;
    g.setColor (Color.yellow) ;
    g.fillRoundRect (0, 0, larg, haut, 10, 10) ;   // la forme d'abord
    g.setColor (Color.black) ;
    g.drawRoundRect (0, 0, larg, haut, 10, 10) ;   // la bordure ensuite

        /* noeud papillon rose à bordure verte */
    int r = 60 ; int x[] = new int[4] ; int y[] = new  int[4] ;
    g.translate (larg+r+20, r) ;
    x = new int[4] ; y = new int[4] ;
    x[0] = y[0] = -r ;     x[1] = y[1] =  r;
    x[2] = r ; y[2] = 0 ;  x[3] = 0 ; y[3] = r ;
    g.setColor (Color.pink) ;  g.fillPolygon (x, y, 4) ;
    g.setColor (Color.green) ; g.drawPolygon (x, y, 4) ;

        /* arc gris a bordure rouge */
    g.translate (r+20, -r) ;
    g.setColor (Color.gray) ;  g.fillArc (0, 0, 2*r, 2*r, 45, 135);
    g.setColor (Color.red) ;   g.drawArc (0, 0, 2*r, 2*r, 45, 135);

       /* arc jaune a bordure rouge plus grande */
    g.translate (2*r+20, 0) ;
    g.setColor (Color.yellow) ;  g.fillArc (0, 0, 2*r, 2*r, 45, 135);
    g.setColor (Color.red) ;   g.drawArc (0, 0, 2*r, 2*r, 45, 210);
  }
}
public class Formes1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



