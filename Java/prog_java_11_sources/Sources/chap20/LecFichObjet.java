import java.io.* ;
import java.nio.* ;
import java.nio.file.* ;
class Point implements Serializable
{ Point (int abs, int ord) {x = abs ; y = ord ; }
  public void affiche() { System.out.println ("Coordonnees = " + x + " " + y) ; }
  private int x, y ;	
}
public class LecFichObjet
{ public static void main (String args []) throws Exception  
  { ObjectInputStream entree
          = new ObjectInputStream (new FileInputStream ("points.dat")) ;
    Point p ;
    int num ;
    boolean eof = false ;
    while (!eof)
    { try
      { num = entree.readInt() ;
        p = (Point) entree.readObject() ;
        System.out.print ("point numero : " + num + " ; ") ;
        p.affiche() ;
      }
      catch (EOFException e)
      { eof = true ;
      }
    }
    entree.close() ;
  }
}
