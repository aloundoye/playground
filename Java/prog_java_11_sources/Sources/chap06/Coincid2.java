class Point
{ public Point(int abs, int ord)
  { x = abs ; y = ord ;
  }
  public static boolean coincide (Point p1, Point p2)
  { return ((p1.x == p2.x) && (p1.y == p2.y)) ;
  }
  private int x, y ;
}
public class Coincid2
{ public static void main (String args[])
  { Point a = new Point (1, 3) ;
    Point b = new Point (2, 5) ;
    Point c = new Point (1,3) ;
    System.out.println ("a et b : " + Point.coincide(a, b) ) ;
    System.out.println ("a et c : " + Point.coincide(a, c) ) ;
  }
}

