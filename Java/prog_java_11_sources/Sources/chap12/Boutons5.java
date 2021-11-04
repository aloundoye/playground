import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class Fen2Boutons extends JFrame
{ public Fen2Boutons ()
  { setTitle ("Avec deux boutons") ;
    setSize (300, 200) ;
    monBouton1 = new JButton ("Bouton A") ;
    monBouton2 = new JButton ("Bouton B") ;
    Container contenu = getContentPane() ;
    contenu.setLayout(new FlowLayout()) ;
    contenu.add(monBouton1) ;
    contenu.add(monBouton2) ;
    EcouteBouton ecout1 = new EcouteBouton(10) ;
    EcouteBouton ecout2 = new EcouteBouton(20) ;
    monBouton1.addActionListener(ecout1);
    monBouton2.addActionListener(ecout2);
  }
  private JButton monBouton1, monBouton2 ;
}
class EcouteBouton implements ActionListener
{ public EcouteBouton (int n) 
  { this.n = n ;
  }
  public void actionPerformed (ActionEvent ev)
  { System.out.println ("action sur bouton " + n) ;
  }
  private int n ;
}
public class Boutons5
{ public static void main (String args[])
  { Fen2Boutons fen = new Fen2Boutons() ;
    fen.setVisible(true) ;
  }
}

