class MaFenetre extends JFrame
{  ..... }
public class EssaiLookAndFeel
{ public static void main (String args[]) throws ClassNotFoundException, 
    UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
    UIManager.LookAndFeelInfo laf[] = UIManager.getInstalledLookAndFeels() ;
    for (UIManager.LookAndFeelInfo l :laf) 
    { System.out.println (l);
      UIManager.setLookAndFeel((String)l.getClassName()) ;
      SwingUtilities.updateComponentTreeUI(fen) ;
      Clavier.lireString() ; // pour une attente
    }
  }
}
