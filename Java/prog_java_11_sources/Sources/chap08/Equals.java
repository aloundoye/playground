class Point
{ public Point(int abs, int ord)
  { x = abs ; y = ord ;
  }
  public boolean equals (Point p)      // Point redefinit equals
  { return ( (p.x == x) && (p.y == y)) ;
  }
  private int x, y ;
}
class Entier                           // entier ne redefinit pas equals
{ public Entier(int n)
  { this.n = n ;
  }
  private int n ;
}
public class Equals
{ public static void main (String args[])
  { Object t[] = { new Point(1, 2), new Point(1, 2), new Entier(5),
                   new Entier(5)} ;
    System.out.println ("t[0].equals(t[1]) = " + t[0].equals(t[1])) ;
    System.out.println ("t[2].equals(t[3]) = " + t[0].equals(t[1])) ;
    System.out.println ("t[0].equals(t[2]) = " + t[0].equals(t[1])) ;
    System.out.println ("t[2].equals(t[0]) = " + t[0].equals(t[1])) ;
    Clavier.lireInt() ;
  }
}

