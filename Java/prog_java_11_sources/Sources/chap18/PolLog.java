import javax.swing.* ;
import java.awt.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("POLICES LOGIQUES") ;
    setSize (700, 200) ;
    pan = new Paneau() ;
    getContentPane().add(pan) ;
  }
  private JPanel pan ;
}
class Paneau extends JPanel
{ public void paintComponent(Graphics g)
  { super.paintComponent(g) ;
    String fontes[] = { "SansSerif", "Serif",   "Monospaced", "Dialog",
                        "DialogInput"} ;
    int styles[] =    { Font.PLAIN,  Font.BOLD, Font.ITALIC,   Font.PLAIN,
                        Font.BOLD+Font.ITALIC} ;
    int tailles[] =   { 12,          10,        18,            32,
                        24} ;
    int x=10, y=10 ;
    for (int i = 0 ; i<fontes.length ; i++)
      { g.setFont (new Font (fontes[i], styles[i], tailles[i])) ;
        FontMetrics fm = g.getFontMetrics() ;
        String ch = fontes[i] + " " + tailles[i]
                    + " abcdefghijklmnopqrstuvwxyz0123456789" ;
        y += fm.getAscent () ;
        g.drawString (ch, x, y) ;
        y += fm.getDescent() + fm.getLeading() ;
      }
  }
}
public class PolLog
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}

