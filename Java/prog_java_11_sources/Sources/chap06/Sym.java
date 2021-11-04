class Point
{ public Point(int abs, int ord)
  { x = abs ; y = ord ;
  }
  public Point symetrique()
  { Point res ;
    res = new Point (y, x) ;
    return res ;
  }
  public void affiche ()
  { System.out.println ("Coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
public class Sym
{ public static void main (String args[])
  { Point a = new Point (1, 2) ;
    a.affiche() ;
    Point b = a.symetrique() ;
    b.affiche() ;
  }
}

