import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("POLICES EXISTANTES") ;
    setSize (600, 300) ;
    pan = new Paneau() ;
    Dimension d = new Dimension(500, 3000) ;
    pan.setPreferredSize(d) ;
    defil = new JScrollPane(pan) ;
    getContentPane().add(defil) ;
  }
  private JPanel pan ;
  private JScrollPane defil ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    String fontes[] = GraphicsEnvironment.getLocalGraphicsEnvironment()
                      .getAvailableFontFamilyNames() ;
    int x=10, y=10 ;
    for (int i = 0 ; i<fontes.length ; i++)
      { g.setFont (new Font (fontes[i], Font.PLAIN, 12)) ;
        FontMetrics fm = g.getFontMetrics() ;
        y += fm.getAscent() ;
        String ch = fontes[i] + " " + "abcdefghijklmnopqrstuvwxyz0123456789" ;
        g.drawString (ch, x, y) ;
        y += fm.getDescent() + fm.getLeading() ;
      }
  }
}
public class PolExist
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

