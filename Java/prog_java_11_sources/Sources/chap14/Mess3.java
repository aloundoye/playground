import javax.swing.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essai message") ;
    setSize (400, 170) ;
  }
}
public class Mess3
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
    JOptionPane.showMessageDialog(fen, "Mauvais choix", "Message d'avertissement",
                                  JOptionPane.ERROR_MESSAGE);
  }
}

