import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Affichage caracteres") ;
    setSize (300, 180) ;
    Container contenu = getContentPane() ;
    pan = new Paneau() ;
    contenu.add(pan) ;
    addKeyListener (new KeyAdapter()
               { public void keyTyped(KeyEvent e)
                 { pan.setCaractereCourant (e.getKeyChar()) ;
                 }
               }) ;
  }
  private Paneau pan ;
}
class Paneau extends JPanel
{ public Paneau()
  { addMouseListener (new MouseAdapter()
            {  public void mouseClicked (MouseEvent e)
               { Graphics g = getGraphics() ;
                 String ch = "" + caractereCourant ;
                 g.drawString (ch, e.getX(), e.getY()) ;
                 g.dispose() ;
               }
            }) ;
  }
  public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
  }
  public void setCaractereCourant (char c)
  { caractereCourant = c ;
  }
  private char caractereCourant = ' ' ;
}

public class Frappes
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

