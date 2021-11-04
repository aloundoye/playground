import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Traces de clics") ;
    setSize (300, 150) ;
    pan = new JPanel() ;
    getContentPane().add(pan) ;
    pan.addMouseListener (new EcouteClic(pan)) ;
  }
  private JPanel pan ;
}
class EcouteClic extends MouseAdapter
{ public EcouteClic (JPanel pan)
  { this.pan = pan ;
  }
  public void mouseClicked (MouseEvent e)
  { int x = e.getX(), y = e.getY() ;
    Graphics g = pan.getGraphics() ;
    g.drawRect (x, y, 5, 5) ;
    g.dispose();
  }
  private JPanel pan ;
}
public class TrClics1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}



