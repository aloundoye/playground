import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("IMAGES") ;
    setSize (300, 100) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public Paneau()
  { rouge = new ImageIcon ("rouge.gif") ;
    jaune = new ImageIcon ("jaune.gif") ;
    vert  = new ImageIcon ("vert.gif") ;
    largIcon = rouge.getIconHeight() ;
    hautIcon = rouge.getIconWidth() ;
  }
  public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    Dimension taille = getSize() ;
    int x=0, y=0 ;
    while (y < taille.height)
     { while (x < taille.width)
       { g.drawImage (rouge.getImage(), x, y, null) ; x += largIcon+3 ;
         g.drawImage (vert.getImage(),  x, y, null) ; x += largIcon+3 ;
         g.drawImage (jaune.getImage(), x, y, null) ; x += largIcon+3 ;
       }
       x = 0 ;
       y += hautIcon+3 ;
     }
  }
  private ImageIcon rouge, vert, jaune ;
  private int hautIcon, largIcon ;
}

public class Images1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



