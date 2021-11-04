import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Colorations") ;
    setSize (300, 100) ;
    Container contenu = getContentPane() ;
    pan = new Paneau() ;
    contenu.add(pan) ;
  }
  private Paneau pan ;
}
class Paneau extends JPanel
{ public Paneau()
  { actionRouge = new ActionCouleur ("rouge", Color.red,    this) ;
    actionBleu =  new ActionCouleur ("bleu",  Color.blue,   this) ;
    actionJaune = new ActionCouleur ("jaune", Color.yellow, this) ;
    registerKeyboardAction (actionRouge,
       KeyStroke.getKeyStroke(KeyEvent.VK_R,
                              InputEvent.ALT_MASK|InputEvent.CTRL_MASK),
       JComponent.WHEN_IN_FOCUSED_WINDOW) ;
    registerKeyboardAction (actionBleu,
       KeyStroke.getKeyStroke(KeyEvent.VK_B,
                              InputEvent.ALT_MASK|InputEvent.CTRL_MASK),
       JComponent.WHEN_IN_FOCUSED_WINDOW) ;
    registerKeyboardAction (actionJaune,
       KeyStroke.getKeyStroke(KeyEvent.VK_J,
                              InputEvent.ALT_MASK|InputEvent.CTRL_MASK),
       JComponent.WHEN_IN_FOCUSED_WINDOW) ;
  }
  private ActionCouleur actionRouge, actionBleu, actionJaune ;
}

class ActionCouleur extends AbstractAction
{ public ActionCouleur (String nomCouleur, Color couleur, Paneau pan)
  { super (nomCouleur) ;
    this.nomCouleur = nomCouleur ;
    this.couleur = couleur ;
    this.pan = pan ;
  }
  public void actionPerformed (ActionEvent e)
  { pan.setBackground (couleur) ;
  }
  private String nomCouleur ;
  private Color couleur ;
  private Paneau pan ;
}
public class Colore1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

