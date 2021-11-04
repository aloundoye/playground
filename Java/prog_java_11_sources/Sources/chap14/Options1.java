import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenInput extends JFrame implements ActionListener
{ String[] couleurs = { "rouge", "vert", "bleu", "jaune", "orange", "blanc"} ;
  public FenInput ()
  { setTitle ("Essai options") ;
    setSize (400, 220) ;
    JButton saisie = new JButton ("CHOIX") ;
    getContentPane().add(saisie, "South") ;
    saisie.addActionListener (this) ;
  }
  public void actionPerformed (ActionEvent e)
  { System.out.println ("** affichage boite d'options") ;
    String txt = (String)JOptionPane.showInputDialog (this,
                        "choisissez une couleur", "BOITE D'OPTIONS",
                        JOptionPane.QUESTION_MESSAGE, null, couleurs, couleurs[1]) ;
    if (txt == null) System.out.println (" pas de choix effectue") ;
      else System.out.println (" option choisie :" + txt) ;
  }
}
public class Options1
{ public static void main (String args[])
  { FenInput fen = new FenInput() ;
    fen.setVisible(true) ;
  }
}

