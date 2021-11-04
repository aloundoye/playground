import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Emploi d'Actions ") ;
    setSize (300, 100) ;
    actionRouge = new MonAction ("EN ROUGE") ;
    actionRouge.putValue(Action.SMALL_ICON, new ImageIcon("icone.gif"));
    actionJaune = new MonAction ("EN JAUNE") ;

    JToolBar barreOutils = new JToolBar() ;
    getContentPane().add(barreOutils, "South") ;
    barreOutils.add(actionRouge) ;
    barreOutils.add(actionJaune) ;
   }
  private MonAction actionRouge, actionJaune ;
  private JMenuBar menu ;
  private JMenu menuCouleur ;
  private JMenuItem optionRouge, optionJaune ;
}
class MonAction extends AbstractAction
{ public MonAction (String nom, Color couleur, String explication)
  { super (nom) ;
  }
  public void actionPerformed (ActionEvent e)
  { System.out.println ("action chaine de commande : "
                           + e.getActionCommand()) ;
  }

}
public class Outil5
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

