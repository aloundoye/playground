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
    EcouteBouton1 ecout1 = new EcouteBouton1() ;
    EcouteBouton2 ecout2 = new EcouteBouton2() ;
    monBouton1.addActionListener(ecout1);
    monBouton2.addActionListener(ecout2);
  }
  private JButton monBouton1, monBouton2 ;
}
class EcouteBouton1 implements ActionListener
{  public void actionPerformed (ActionEvent ev)
  { System.out.println ("action sur bouton 1") ;
  }
}
class EcouteBouton2 implements ActionListener
{  public void actionPerformed (ActionEvent ev)
  { System.out.println ("action sur bouton 2") ;
  }
}
public class Boutons4
{ public static void main (String args[])
  { Fen2Boutons fen = new Fen2Boutons() ;
    fen.setVisible(true) ;
  }
}

