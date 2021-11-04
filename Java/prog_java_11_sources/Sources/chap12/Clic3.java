import javax.swing.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame
{ MaFenetre ()    // constructeur
  { setTitle ("Gestion de clics") ;
    setBounds (10, 20, 300, 200) ;
    addMouseListener ( new MouseAdapter()
     { public void mouseClicked(MouseEvent ev)
       { int x = ev.getX() ;
         int y = ev.getY() ;
         System.out.println ("clic au point de coordonnees " + x + ", " + y ) ;
       }
     } ) ;
  }
}
public class Clic3
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

