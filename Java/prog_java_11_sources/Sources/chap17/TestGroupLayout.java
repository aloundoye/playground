import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ public static int NBOUTONS = 4 ;
  public MaFenetre ()
  { setTitle ("Exemple GroupLayout 1") ;
    setSize (400, 80) ;
    Container contenu = getContentPane() ;
    boutons = new JButton[NBOUTONS] ;
    for (int i=0 ; i<NBOUTONS ; i++)  boutons[i] = new JButton ("Bouton " + i) ;
       
    GroupLayout ges = new GroupLayout (contenu) ;
    contenu.setLayout(ges) ;
      // hg = description horizontale du groupe
    GroupLayout.SequentialGroup hg = ges.createSequentialGroup () ;
    ges.setHorizontalGroup(hg) ;
    for (JButton bouton : boutons) hg.addComponent(bouton) ; 
      // hv = description verticale du groupe
    GroupLayout.ParallelGroup hv = ges.createParallelGroup () ;
    ges.setVerticalGroup (hv) ;
    for (JButton bouton : boutons) hv.addComponent (bouton) ;
  }   
  private JButton boutons[] ;
}
public class TestGroupLayout1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}
