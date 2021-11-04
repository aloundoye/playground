import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Colorations") ;
    setSize (300, 100) ;
    Container contenu = getContentPane() ;
    pan = new JPanel() ;
    contenu.add(pan) ;
    addKeyListener (new KeyAdapter()
      { public void keyPressed(KeyEvent e)
        { if (e.isControlDown() && e.isAltDown())
          { int touche = e.getKeyCode() ;
            switch (touche)
            { case KeyEvent.VK_R : pan.setBackground (Color.red) ;    break ;
              case KeyEvent.VK_B : pan.setBackground (Color.blue) ;   break ;
              case KeyEvent.VK_J : pan.setBackground (Color.yellow) ; break ;
            }
          }
        }
      }) ;
 }
 private JPanel pan ;
}
public class Colore0
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

