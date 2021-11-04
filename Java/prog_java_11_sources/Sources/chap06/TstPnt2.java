public class TstPnt2
{ public static void main (String args[])
  { Point a ;
    a = new Point() ;
    a.initialise(3, 5) ;
    a.affiche() ;
    a.deplace(2, 0) ;
    a.affiche() ;
    Point b = new Point() ;
    b.initialise (6, 8) ;
    b.affiche() ;
  }
}
class Point
{ public void initialise (int abs, int ord)
  { x = abs ;
    y = ord ;
  }
  public void deplace (int dx, int dy)
  { x += dx ;
    y += dy ;
  }
  public void affiche ()
  { System.out.println ("Je suis un point de coordonnees " + x + " " + y) ;
  }
  private int x ;   // abscisse
  private int y ;   // ordonnee
}

