import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenLabel extends JFrame implements ActionListener
{ public FenLabel ()
  { setTitle ("Essais Etiquettes") ;
    setSize (300, 120) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout() ) ;
    bouton = new JButton ("COMPTEUR") ;
    bouton.addActionListener (this) ;
    contenu.add(bouton) ;
    nbClics = 0 ;
    compte = new JLabel ("nombre de clics sur COMPTEUR = "+ nbClics) ;
    contenu.add(compte) ;
  }
  public void actionPerformed (ActionEvent e)
  { nbClics++ ;
    compte.setText("nombre de clics sur COMPTEUR = "+nbClics) ;
  }
  private JButton bouton ;
  private JLabel compte ;
  private int nbClics ;
}
public class Label1
{ public static void main (String args[])
  { FenLabel fen = new FenLabel() ;
    fen.setVisible(true) ;
  }
}

