import javax.swing.* ;  // pour showInputDialog
import java.io.* ;
public class Lecsfic1
{ public static void main (String args[]) throws IOException
  { String nomfich ;
    int n = 0 ;

    System.out.print ("donnez le nom du fichier a lister : ") ;
    nomfich = Clavier.lireString() ;
    DataInputStream entree = new DataInputStream
                           ( new FileInputStream (nomfich)) ;
    System.out.println ("valeurs lues dans le fichier " + nomfich + " :") ;
    boolean eof = false ;  // sera mis a true par exception EOFile
    while (!eof)
    { try
      {  n = entree.readInt ()  ;
      }
      catch (EOFException e)
      { eof = true ;
      }
      if (!eof) System.out.println (n) ;
    }
    entree.close () ;
    System.out.println ("*** fin liste fichier ***");
  }
}


