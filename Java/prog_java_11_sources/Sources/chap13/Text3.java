import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;   // utile pour DocumentListener ....
class FenText extends JFrame implements DocumentListener
{ public FenText ()
  { setTitle ("Miroir d'un texte") ;
    setSize (300, 110) ;
    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout() ) ;

    saisie = new JTextField (20) ;
    contenu.add(saisie) ;
    saisie.getDocument().addDocumentListener (this) ;

    copie = new JTextField (20) ;
    copie.setEditable(true);
    copie.setBackground (Color.gray) ;
    contenu.add(copie) ;
  }
  public void insertUpdate (DocumentEvent e)
  { String texte = saisie.getText() ;
    copie.setText(texte) ;
  }
  public void removeUpdate (DocumentEvent e)
  { String texte = saisie.getText() ;
    copie.setText(texte) ;
  }
  public void changedUpdate (DocumentEvent e)
  {}
  private JTextField saisie, copie ;
  private JButton bouton ;
}
public class Text3
{ public static void main (String args[])
  { FenText fen = new FenText() ;
    fen.setVisible(true) ;
  }
}


