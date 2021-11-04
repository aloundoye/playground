import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.event.* ;

class MaFenetre extends JFrame implements ActionListener
{ public static int NBOUTONS = 8 ;
  public MaFenetre ()
  { setTitle ("Exemple CardLayout") ;
    setSize (400, 180) ;
    Container contenu = getContentPane() ;

    panCard = new JPanel() ; // panneau pour la pile
    contenu.add (panCard) ;
    panCom = new JPanel() ;  // panneau pour les boutons de parcours de la pile
    contenu.add (panCom, "South") ;
      /* creation de la pile de boutons */
    pile = new CardLayout (30, 10) ;
    panCard.setLayout (pile) ;
    boutons = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)
    { boutons[i] = new JButton ("Bouton " + i) ;
      panCard.add(boutons[i], "Bouton") ; // identification obligatoire ici
    }
      /* creation des boutons de parcours de la pile */
    prec = new JButton ("precedent") ; panCom.add (prec) ;
    prec.addActionListener(this) ;
    suiv = new JButton ("suivant") ;   panCom.add (suiv) ;
    suiv.addActionListener(this) ;
    prem = new JButton ("premier") ;   panCom.add (prem) ;
    prem.addActionListener(this) ;
    der = new JButton ("dernier") ;    panCom.add (der) ;
    der.addActionListener(this) ;
  }
  public void actionPerformed (ActionEvent e)
  { JButton source = (JButton)e.getSource() ;
    if (source == prec) pile.previous (panCard) ;
    if (source == suiv) pile.next (panCard) ;
    if (source == prem) pile.first (panCard) ;
    if (source == der)  pile.last (panCard) ;
  }
  private JButton boutons[] ;
  private JPanel panCard, panCom ;
  private CardLayout pile ;
  private JButton prec, suiv, prem, der ;
}
public class Layout3
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

