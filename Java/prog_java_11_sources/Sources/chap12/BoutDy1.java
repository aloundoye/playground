import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenBoutonsDyn extends JFrame implements ActionListener
{ final int NBOUTONS=5 ;
  public FenBoutonsDyn ()
  { setTitle ("Activation/Desactivation") ;
    setSize (500, 150) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout()) ;
    tabBout = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)
    { tabBout[i] = new JButton ("BOUTON"+i) ;
      contenu.add(tabBout[i]) ;
      tabBout[i].addActionListener (this);
    }
  }
  public void actionPerformed (ActionEvent ev)
  { System.out.print ("ETAT BOUTONS = ") ;
    for (int i=0 ; i<NBOUTONS ; i++)
      System.out.print (tabBout[i].isEnabled() + " ") ;
    System.out.println() ;
    JButton source = (JButton) ev.getSource() ;
    System.out.println ("on desactive le bouton : "
                        + source.getActionCommand()) ;
    source.setEnabled(false) ;
  }
  private JButton tabBout[] ;
}
public class BoutDy1
{ public static void main (String args[])
  { FenBoutonsDyn fen = new FenBoutonsDyn () ;
    fen.setVisible (true) ;
  }
}

