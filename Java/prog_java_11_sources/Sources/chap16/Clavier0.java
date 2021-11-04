import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame implements KeyListener
{ public MaFenetre ()
  { setTitle ("Exemple lecture clavier") ;
    setSize (300, 180) ;
    addKeyListener (this) ;
  }
  public void keyPressed (KeyEvent e)
  { int code = e.getKeyCode() ;
    System.out.println ("Touche "+code+ " pressee : " + e.getKeyText (code)) ;
  }
  public void keyReleased (KeyEvent e)
  { int code = e.getKeyCode() ;
    System.out.println ("Touche"+code+ " relachee : " + e.getKeyText (code)) ;
  }
  public void keyTyped (KeyEvent e)
  { char c = e.getKeyChar() ;
    System.out.println ("Caractere frappe : " + c + " de code " + (int)c) ;
  }
}
public class Clavier0
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}


