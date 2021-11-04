import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;
class FenMenu extends JFrame implements ActionListener, ItemListener
{ public FenMenu ()
  { setTitle ("Exemple de menu") ;
    setSize (300, 150) ;
       /* creation barre des menus */
    barreMenus = new JMenuBar() ;
    setJMenuBar(barreMenus) ;
       /* creation menu Couleur et son groupe de 2 boutons radio : Rouge et Vert */
    couleur = new JMenu ("Couleur") ;
    barreMenus.add(couleur) ;
    rouge = new JRadioButtonMenuItem ("Rouge") ;
    couleur.add(rouge) ;
    rouge.addActionListener (this) ;
    rouge.addItemListener (this) ;
    vert = new JRadioButtonMenuItem ("Vert") ;
    couleur.add(vert) ;
    vert.addActionListener (this) ;
    vert.addItemListener (this) ;
    ButtonGroup groupe = new ButtonGroup() ;
    groupe.add(rouge) ;
    groupe.add(vert) ;
       /* creation menu Dimensions et ses cases a cocher Hauteur et Largeur */
    formes = new JMenu ("Formes") ;
    barreMenus.add(formes) ;
    rectangle = new JCheckBoxMenuItem ("Rectangle") ;
    formes.add(rectangle) ;
    rectangle.addActionListener (this) ;
    rectangle.addItemListener (this) ;
    ovale = new JCheckBoxMenuItem ("Ovale") ;
    formes.add(ovale) ;
    ovale.addActionListener (this) ;
    ovale.addItemListener (this) ;
  }
  public void actionPerformed (ActionEvent e)
  { Object source = e.getSource() ;
    if (source == rouge)     System.out.println ("** Action option rouge") ;
    if (source == vert)      System.out.println ("** Action option vert") ;
    if (source == rectangle) System.out.println ("** Action option rectangle") ;
    if (source == ovale)     System.out.println ("** Action option ovale") ;
  }
  public void itemStateChanged (ItemEvent e)
  { Object source = e.getSource() ;
    if (source == rouge)     System.out.println ("** Item option rouge") ;
    if (source == vert)      System.out.println ("** Item option vert") ;
    if (source == rectangle) System.out.println ("** Item option rectangle") ;
    if (source == ovale)     System.out.println ("** Item option ovale") ;
    System.out.print ("Options selectionnees : ") ;
    if (rouge.isSelected())     System.out.print (" rouge") ;
    if (vert.isSelected())      System.out.print (" vert") ;
    if (rectangle.isSelected()) System.out.print (" rectangle") ;
    if (ovale.isSelected())     System.out.print (" ovale") ;
    System.out.println() ;
   }
  private JMenuBar barreMenus ;
  private JMenu couleur, formes ;
  private JRadioButtonMenuItem rouge, vert ;
  private JCheckBoxMenuItem rectangle, ovale ;
}
public class Menu2
{ public static void main (String args[])
  { FenMenu fen = new FenMenu() ;
    fen.setVisible(true) ;
  }
}


