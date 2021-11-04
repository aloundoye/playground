import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essais polygones et lignes brisees") ;
    setSize (400, 180) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
        /* trace d'un hexagone */
    int r = 60 ;
    g.translate (10+r, 10+r) ;
    int x[] = new int[6]; int y[] = new int[6] ;
    for (int i=0 ; i<6 ; i++)
    { x[i] = (int) (r*Math.cos (i*Math.PI/3)) ;
      y[i] = (int) (r*Math.sin (i*Math.PI/3)) ;
    }
    g.drawPolygon (x, y, 6) ;

      /* trace d'un noeud papillon */
    g.translate (2*r+20, 0) ;
    x = new int[4] ; y = new int[4] ;
    x[0] = y[0] = -r ;
    x[1] = y[1] =  r;
    x[2] = r ; y[2] = 0 ;
    x[3] = 0 ; y[3] = r ;
    g.drawPolygon (x, y, 4) ;

      /* trace d'une ligne brisee */
    g.translate (r+20, -r) ;
    x = new int[5] ; y = new int[5] ;
    x[0] = y[0] = 0 ;
    x[1] = r ; y[1] = 0 ;
    x[2] = r ; y[2] = 2*r ;
    x[3] = r/2 ; y[3] = r/2 ;
    x[4] = 3*r/2 ; y[4] = r/2 ;
    g.drawPolyline(x, y, 5) ;
  }
}
public class Polys
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



