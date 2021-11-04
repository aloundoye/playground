import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ public static int NBOUTONS = 10 ;
  public static int x[] =    { 0,  3,  3,  0,  0, 3} ;
  public static int y[] =    { 0,  0,  1,  2,  3, 2} ;
  public static int larg[] = { 3,  2,  2,  3,  3, 2} ;
  public static int haut[] = { 2,  1,  1,  1,  1, 2} ;
  public static int px [] =  {60, 40,  0,  0,  0, 0} ;
  public static int py [] =  { 0, 25, 25, 25, 25, 0} ;
  public MaFenetre ()
  { setTitle ("Exemple GridBagLayout") ;
    setSize (350, 180) ;
    Container contenu = getContentPane() ;
    GridBagLayout g = new GridBagLayout() ;
    contenu.setLayout (g) ;
    GridBagConstraints c = new GridBagConstraints() ;
    c.fill = c.BOTH ;
    for (int i = 0 ; i<x.length ; i++)
    { c.gridx = x[i] ; c.gridy = y[i] ;
      c.gridwidth = larg[i] ; c.gridheight = haut[i] ;
      c.weightx = px[i] ; c.weighty = py[i] ;
      contenu.add (new JButton ("Bouton"+(i+1)), c) ;
    }
  }
}
public class GridBag
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

