class Point
{ public Point(int abs, int ord)
  { x = abs ; y = ord ;
  }
  private int x, y ;
}
public class ToString1
{ public static void main (String args[])
  { Point a = new Point (1, 2) ;
    Point b = new Point (5, 6) ;
    System.out.println ("a = " + a.toString()) ;
    System.out.println ("b = " + b.toString()) ;
  }
}    

