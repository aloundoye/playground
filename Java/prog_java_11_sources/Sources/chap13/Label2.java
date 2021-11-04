import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenLabel extends JFrame implements ActionListener
{ public FenLabel ()
  { setTitle ("Essais Labels") ;
    setSize (300, 120) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout() ) ;
    bouton = new JButton ("COMPTEUR") ;
    bouton.addActionListener (this) ;
    contenu.add(bouton) ;
    titre = new JLabel ("nombre de clics sur COMPTEUR = ") ;
    contenu.add(titre) ;
    nbClics = 0 ;
    compte = new JLabel (""+nbClics) ;
    contenu.add(compte) ;
  }
  public void actionPerformed (ActionEvent e)
  { nbClics++ ;
    compte.setText(""+nbClics) ;
  }
  private JButton bouton ;
  private JLabel titre, compte ;
  private int nbClics ;
}
public class Label2
{ public static void main (String args[])
  { FenLabel fen = new FenLabel() ;
    fen.setVisible(true) ;
  }
}


