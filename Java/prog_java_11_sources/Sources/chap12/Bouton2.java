import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class Fen1Bouton extends JFrame implements ActionListener
   // Attention : ne pas oublier implements
{ public Fen1Bouton ()
  { setTitle ("Premier bouton") ;
    setSize (300, 200) ;
    monBouton = new JButton ("ESSAI") ;
    getContentPane().setLayout(new FlowLayout()) ;
    getContentPane().add(monBouton) ;
    monBouton.addActionListener(this);
  }
  public void actionPerformed (ActionEvent ev)
  { System.out.println ("action sur bouton ESSAI") ;
  }
  private JButton monBouton ;
}
public class Bouton2
{ public static void main (String args[])
  { Fen1Bouton fen = new Fen1Bouton() ;
    fen.setVisible(true) ;
  }
}

