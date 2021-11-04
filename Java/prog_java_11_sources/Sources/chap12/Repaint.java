import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame implements ActionListener
{ MaFenetre ()
  { setTitle ("Exemple appel repaint") ;
    setSize (300, 200) ;
    Container contenu = getContentPane() ;
       // creation paneau pour le dessin
    pan = new Paneau() ;
    pan.setBackground (Color.cyan) ;
    contenu.add(pan) ;
       // creation bouton "rectangle"
    rectangle = new JButton ("Rectangle") ;
    contenu.add(rectangle, "North") ;
    rectangle.addActionListener (this) ;
       // création bouton "ovale"
    ovale = new JButton ("Ovale") ;
    contenu.add(ovale, "South") ;
    ovale.addActionListener (this) ;
  }
  public void actionPerformed (ActionEvent ev)
  { if (ev.getSource() == rectangle) pan.setRectangle() ;
    if (ev.getSource() == ovale)     pan.setOvale() ;
    pan.repaint() ;   // pour forcer la peinture du paneau des maintenant
  }
  private Paneau pan ;
  private JButton rectangle, ovale ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    if (ovale)     g.drawOval (80, 20, 120, 60) ;
    if (rectangle) g.drawRect (80, 20, 120, 60) ;
  }
  public void setRectangle() {rectangle = true ;  ovale = false ; }
  public void setOvale()     {rectangle = false ; ovale = true ;  }
  private boolean rectangle = false, ovale = false ;
}
public class Repaint
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

