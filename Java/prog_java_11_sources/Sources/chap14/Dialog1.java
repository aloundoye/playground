import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenDialog extends JFrame implements ActionListener
{ public FenDialog ()
  { setTitle ("Essai boite de dialogue") ;
    setSize (400, 200) ;
    lanceDial = new JButton ("Lancement dialogue") ;
    Container contenu = getContentPane() ;
    contenu.setLayout(new FlowLayout()) ;
    contenu.add (lanceDial) ;
    lanceDial.addActionListener(this) ;
  }
  public void actionPerformed (ActionEvent e)
  { JDialog bd = new JDialog(this, "Mon dialogue", true) ;
    System.out.println ("avant affichage boite dialogue") ;
    bd.setSize (250, 100) ;
    bd.setVisible(true) ;
    System.out.println ("apres fermeture boite dialogue") ;
  }
  private JButton lanceDial ;
}
public class Dialog1
{ public static void main (String args[])
  { FenDialog fen = new FenDialog() ;
    fen.setVisible(true) ;
  }
}


