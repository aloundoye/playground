import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame implements WindowListener
{ public MaFenetre ()
  { setTitle ("Evenements fenetre") ;
    setSize (300, 100) ;
    addWindowListener (this) ;
  }
  public void windowClosing (WindowEvent e)
  { System.out.println ("fenetre en cours fermeture") ;
  }
  public void windowOpened (WindowEvent e)
  { System.out.println ("ouverture fenetre") ;
  }
  public void windowIconified (WindowEvent e)
  { System.out.println ("fenetre en icone") ;
  }
  public void windowDeiconified (WindowEvent e)
  { System.out.println ("icone en fenetre") ;
  }
  public void windowClosed (WindowEvent e)
  { System.out.println ("fenetre fermee") ;
  }
  public void windowActivated (WindowEvent e)
  { System.out.println ("fenetre activee") ;
  }
  public void windowDeactivated (WindowEvent e)
  { System.out.println ("fenetre desactivee") ;
  }
}

public class EvFen
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

