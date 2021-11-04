import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenBoutonsDyn extends JFrame
{ public FenBoutonsDyn ()
  { setTitle ("Boutons dynamiques") ;
    setSize (500, 150) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout()) ;
    crBouton = new JButton ("CREATION BOUTON") ;
    contenu.add(crBouton) ;
    EcoutCr ecoutCr = new EcoutCr (contenu) ;
    crBouton.addActionListener (ecoutCr) ;
  }
  private JButton crBouton ;
}
class EcoutCr implements ActionListener
{ public EcoutCr (Container contenu)
  { this.contenu = contenu ;
  }
  public void actionPerformed (ActionEvent ev)
  { JButton nouvBout = new JButton ("BOUTON") ;
    contenu.add(nouvBout) ;
    EcoutBout ecoutBout = new EcoutBout() ;
    contenu.validate(); // pour recalculer
  }
  private Container contenu ;
}
public class BoutDy0
{ public static void main (String args[])
  { FenBoutonsDyn fen = new FenBoutonsDyn () ;
    fen.setVisible (true) ;
  }
}

