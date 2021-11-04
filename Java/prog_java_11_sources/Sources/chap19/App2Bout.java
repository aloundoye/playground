import java.awt.* ;
import java.awt.event.* ;
import javax.swing.event.* ;
import javax.swing.* ;
public class App2Bout extends JApplet implements ActionListener
{ public void init ()
  { pan = new JPanel ();
    panCom = new JPanel() ;
    Container contenu = getContentPane() ;
    contenu.add(pan) ;
    contenu.add(panCom, "South") ;
    rouge = new JButton ("rouge") ;
    jaune = new JButton ("jaune") ;
    rouge.addActionListener(this) ;
    jaune.addActionListener(this) ;
    panCom.add(rouge) ;
    panCom.add(jaune) ;
  }
  public void actionPerformed (ActionEvent e)
  { if (e.getSource() == rouge) pan.setBackground (Color.red) ;
    if (e.getSource() == jaune) pan.setBackground (Color.yellow) ;
  }
  private JPanel pan, panCom ;
  private JButton rouge, jaune ;
}

