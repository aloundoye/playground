import javax.swing.* ;
class MaFenetre extends JFrame
{ public MaFenetre ()   // constructeur
  { setTitle ("Ma premiere fenetre") ;
    setSize (300, 150) ;
  }
}  
public class Premfen1
{ public static void main (String args[])
  { JFrame fen = new MaFenetre() ;
    fen.setVisible (true) ;
  }
}

