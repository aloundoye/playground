import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class Fen2Boutons extends JFrame implements ActionListener
{ public Fen2Boutons ()
  { setTitle ("Avec deux boutons") ;
    setSize (300, 200) ;
    monBouton1 = new JButton ("Bouton A") ;
    monBouton2 = new JButton ("Bouton B") ;
    Container contenu = getContentPane() ;
    contenu.setLayout(new FlowLayout()) ;
    contenu.add(monBouton1) ;
    contenu.add(monBouton2) ;
    monBouton1.addActionListener(this);  // la fenetre ecoute monBouton1
    monBouton2.addActionListener(this);  // la fenetre ecoute monBouton2
  }
  public void actionPerformed (ActionEvent ev)   // gestion commune
  { System.out.println ("action sur un bouton") ;  // tous les boutons
  }
  private JButton monBouton1, monBouton2 ;
}
public class Boutons1
{ public static void main (String args[])
  { Fen2Boutons fen = new Fen2Boutons() ;
    fen.setVisible(true) ;
  }
}



