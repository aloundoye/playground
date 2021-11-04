import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;   // utile pour ListSelectionListener
class FenList extends JFrame implements ListSelectionListener
{ public FenList ()
  { setTitle ("Essais boite de liste") ;
    setSize (300, 160) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout() ) ;
    liste = new JList (couleurs) ;
    contenu.add(liste) ;
    liste.addListSelectionListener (this) ;
  }
  public void valueChanged (ListSelectionEvent e)
  { if (!e.getValueIsAdjusting())
    { System.out.println ("**Action Liste - valeurs selectionnees :") ;
      Object[] valeurs = liste.getSelectedValues() ;
      for (int i = 0 ; i<valeurs.length ; i++)
        System.out.println ((String) valeurs[i]) ;
    }
  }
  private String[] couleurs = {"rouge", "bleu", "gris", "vert", "jaune", "noir" } ;
  private JList liste ;
}

public class Liste
{ public static void main (String args[])
  { FenList fen = new FenList() ;
    fen.setVisible(true) ;
  }
}
  

