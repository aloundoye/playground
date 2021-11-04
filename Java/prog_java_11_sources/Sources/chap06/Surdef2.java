class Point
{ public Point ()                  // constructeur 1 (sans argument)
  { x = 0 ;  y = 0 ;
  }
  public Point (int abs)           // constructeur 2 (un argument)
  { x = y = abs ;
  }
  public Point (int abs, int ord ) // constructeur 3 (deux arguments)
  { x = abs ; y = ord ;
  }
  public void affiche ()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
public class Surdef2
{ public static void main (String args[])
  { Point a = new Point () ;      // appelle constructeur 1
    a.affiche() ;
    Point b = new Point (5) ;     // appelle constructeur 2
    b.affiche() ;
    Point c = new Point (3, 9) ;  // appelle constructeur 3
    c.affiche() ;
  }
}

