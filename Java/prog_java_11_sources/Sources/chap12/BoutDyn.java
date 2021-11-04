import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenBoutonsDyn extends JFrame
{ public FenBoutonsDyn ()
  { setTitle ("Boutons dynamiques") ;
    setSize (500, 200) ;
    Container contenu = getContentPane() ;
    contenu.setLayout(new FlowLayout()) ;
    crBouton = new JButton ("CREATION BOUTON") ;
    contenu.add(crBouton) ;
    EcoutCr ecoutCr = new EcoutCr (this) ;
    crBouton.addActionListener (ecoutCr) ;
  }
  private JButton crBouton ;
}
class EcoutCr implements ActionListener
{ public EcoutCr (JFrame fen)
  { this.fen = fen ;
  }
  public void actionPerformed (ActionEvent ev)
  { JButton nouvBout = new JButton ("BOUTON") ;
    fen.getContentPane().add(nouvBout) ;
    EcoutBout ecoutBout = new EcoutBout() ;
    nouvBout.addActionListener (ecoutBout) ;
  }
  private JFrame fen ;
}
class EcoutBout implements ActionListener
{ public void actionPerformed (ActionEvent ev)
  { JButton source = (JButton)ev.getSource() ;
    source.setEnabled (false);
  }
}
public class BoutDyn
{ public static void main (String args[])
  { FenBoutonsDyn fen = new FenBoutonsDyn () ;
    fen.setVisible (true) ;
  }
}


