import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Emploi d'Actions ") ;
    setSize (300, 100) ;
    menu = new JMenuBar() ;
    setJMenuBar (menu) ;

    menuCouleur = new JMenu("COULEUR") ;
    menu.add(menuCouleur) ;
    actionRouge = new MonAction ("EN ROUGE", Color.red) ;
    actionJaune = new MonAction ("EN JAUNE", Color.yellow) ;
    menuCouleur.add(actionRouge) ;
    menuCouleur.add(actionJaune) ;

    menuSurg = new JPopupMenu() ;
    menuSurg.add(actionRouge) ;
    menuSurg.add(actionJaune) ;
    addMouseListener (new MouseAdapter()
                      { public void mouseReleased(MouseEvent e)
                        { menuSurg.show (e.getComponent(), e.getX(), e.getY()) ;
                        }
                      }) ;
   }
  private MonAction actionRouge, actionJaune ;
  private JMenuBar menu ;
  private JMenu menuCouleur ;
  private JMenuItem optionRouge, optionJaune ;
  private JPopupMenu menuSurg ;
}
class MonAction extends AbstractAction
{ public MonAction (String nom, Color couleur)
  { super (nom) ;
    this.couleur = couleur ;
  }
  public void actionPerformed (ActionEvent e)
  { if (couleur == Color.red)
       System.out.println ("action rouge, chaine de commande : "
                           + e.getActionCommand()) ;
    if (couleur == Color.yellow)
        System.out.println ("action jaune, chaine de commande : "
                           + e.getActionCommand()) ;
  }
  private Color couleur ;
}
public class Actions2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

