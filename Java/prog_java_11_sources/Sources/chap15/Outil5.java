import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Emploi d'Actions ") ;
    setSize (300, 100) ;
    actionRouge = new MonAction () ;
    actionRouge.putValue(Action.SMALL_ICON, new ImageIcon("rouge.gif"));
    actionVert = new MonAction () ;
    actionVert.putValue(Action.SMALL_ICON, new ImageIcon("vert.gif"));

    barreOutils = new JToolBar() ;
    getContentPane().add(barreOutils, "North") ;
    barreOutils.add(actionRouge) ;
    barreOutils.add(actionVert) ;
   }
  private MonAction actionRouge, actionVert ;
  private JToolBar barreOutils ;
}
class MonAction extends AbstractAction
{ public void actionPerformed (ActionEvent e)
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

