import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenCoches extends JFrame
                implements ActionListener, ItemListener
{ public FenCoches ()
  { setTitle ("Exemple de cases a cocher") ;
    setSize (400, 100) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout()) ;

    coche1 = new JCheckBox ("case 1") ;
    contenu.add(coche1) ;
    coche1.addItemListener (this) ;

    coche2 = new JCheckBox ("case 2") ;
    contenu.add(coche2) ;
    coche2.addItemListener (this) ;

    etat = new JButton ("ETAT") ;
    contenu.add(etat) ;
    etat.addActionListener (this) ;
  }
  public void itemStateChanged (ItemEvent ev)
  { Object source = ev.getSource() ;
    if (source == coche1) System.out.println ("action case 1") ;
    if (source == coche2) System.out.println ("action case 2") ;
  }
  public void actionPerformed (ActionEvent ev)
  { System.out.println ("ETAT CASES : " + coche1.isSelected() + " "
                                        + coche2.isSelected()) ;
  }
  private JCheckBox coche1, coche2 ;
  private JButton etat ;
}
public class Cases2
{ public static void main (String args[])
  { FenCoches fen = new FenCoches() ;
    fen.setVisible(true) ;
  }
}

