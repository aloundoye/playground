import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
class FenOutil extends JFrame implements ActionListener
{ public FenOutil ()
  { setTitle ("Barre d'outils") ;
    setSize (300, 100) ;
    Container contenu = getContentPane() ;
      /* creation barre d'outils couleurs */
    barreOutils = new JToolBar () ;
    boutonRouge = new JButton ("Rouge") ;
    barreOutils.add (boutonRouge) ;
    boutonVert = new JButton ("Vert") ;
    barreOutils.add (boutonVert) ;
    contenu.add(barreOutils, "North") ;
  }
  public void actionPerformed (ActionEvent e)
  { if (e.getSource() == boutonRouge) System.out.println ("action rouge") ;
    if (e.getSource() == boutonVert)  System.out.println ("action vert") ;
  }
  private JToolBar barreOutils ;
  private JButton boutonRouge, boutonVert ;
}
public class Outil1
{ public static void main (String args[])
  { FenMenu fen = new FenMenu() ;
    fen.setVisible(true) ;
  }
}


