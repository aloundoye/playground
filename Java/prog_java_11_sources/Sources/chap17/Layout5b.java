import javax.swing.* ;
import java.awt.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Exemple BoxLayout horizontal") ;
    setSize (200, 150 ) ;
    Container contenu = getContentPane() ;

    bVert = Box.createVerticalBox() ;
    contenu.add(bVert) ;
    b1 = new JButton ("Bouton1") ;
    bVert.add (b1) ;
    txt = new JTextField (20) ;
    bVert.add (txt) ;
    coche1 = new JCheckBox ("case a cocher") ;
    bVert.add (coche1) ;
    etiq = new JLabel ("Bonjour") ;
    bVert.add(etiq) ;
  }
  private Box bVert ;
  private JButton b1 ;
  private JCheckBox coche1 ;
  private JTextField txt ;
  private JLabel etiq ;
}
public class Layout5b
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

