import javax.swing.* ;
public class Input1
{ public static void main (String args[])
  { String txt ;
    while (true)
     { txt = JOptionPane.showInputDialog (null, "donnez un texte") ;
       if (txt == null) System.out.println ("pas de texte saisi") ;
         else System.out.println ("texte saisi :" + txt + ": de longueur " + txt.length()) ;
     }
  }
}

