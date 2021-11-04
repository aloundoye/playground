import javax.swing.* ;
import java.awt.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Exemple strut et glue") ;
    setSize (150, 200) ;
    Container contenu = getContentPane() ;

    bVert = Box.createVerticalBox() ;
    contenu.add(bVert) ;
    b1 = new JButton ("Bouton1") ;
    bVert.add (b1) ;
    bVert.add (Box.createVerticalStrut(10)) ;  // espace 10 pixels
    b2 = new JButton ("Bouton2") ;
    bVert.add (b2) ;
    bVert.add (Box.createGlue()) ;               // espacement maximum
    coche1 = new JCheckBox ("case a cocher") ;
    bVert.add (coche1) ;
  }
  private Box bVert ;
  private JButton b1, b2 ;
  private JCheckBox coche1 ;
}
public class Layout7
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

