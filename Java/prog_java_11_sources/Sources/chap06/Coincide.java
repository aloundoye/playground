class Point
{ public Point(int abs, int ord)
  { x = abs ; y = ord ;  }
  public boolean coincide (Point pt)
  { return ((pt.x == x) && (pt.y == y)) ;
  }
  private int x, y ;
}
public class Coincide
{ public static void main (String args[])
  { Point a = new Point (1, 3) ;
    Point b = new Point (2, 5) ;
    Point c = new Point (1,3) ;
    System.out.println ("a et b : " + a.coincide(b) + " " + b.coincide(a)) ;
    System.out.println ("a et c : " + a.coincide(c) + " " + c.coincide(a)) ;
  }
}
          
