import java.util.* ;
public class EnsPt2
{ public static void main (String args[])
  { Point p1 = new Point (1, 3), p2 = new Point (2, 2) ;
    Point p3 = new Point (4, 5), p4 = new Point (1, 8) ;
    Point p[] = {p1, p2, p1, p3, p4, p3} ;
    HashSet<Point> ens = new HashSet<Point> () ;
                                       // HashSet ens=new HashSet() ;  <-- avant JDK5.0
    for (Point px : p)                 // for (int i=0 ; i<p.length ; i++)          <--
    { System.out.print ("le point ") ;
      px.affiche() ;                   //    p[i].affiche() ;
      boolean ajoute = ens.add (px) ;  //    boolean ajoute = ens.add (p[i]) ;
      if (ajoute) System.out.println (" a ete ajoute") ;
             else System.out.println ("est deja present") ;
      System.out.print ("ensemble = " ) ; affiche(ens) ;
    }
  }
  public static void affiche (HashSet<Point> ens)
                   //  public static void affiche (HashSet ens)      <-- avant JDK5.0
  { Iterator<Point> iter = ens.iterator() ; //Iterator iter = ens.iterator() ;     <--
    while (iter.hasNext())
    { Point p = iter.next() ;               // Point p = (Point)iter.next() ;      <--
      p.affiche() ;
    }
    System.out.println () ;
  }
}
class Point implements Comparable   // ne pas oublier implements ....
{ Point (int x, int y) { this.x = x ; this.y = y ; }
  public int compareTo (Object pp)
  { Point p = (Point) pp ;    // egalite si coordonnees egales
    if (this.x < p.x) return -1 ;
     else if (this.x > p.x) return 1 ;
      else if (this.y < p.y) return -1 ;
       else if (this.y > p.y) return 1 ;
        else return 0 ;
  }
  public void affiche ()
  { System.out.print ("[" + x + " " + y + "] ") ;
  }
  private int x, y ;
}

