class Point
{ public Point(int abs, int ord)
  { x = abs ;
    y = ord ;
    System.out.println ("constructeur deux arguments : " + x + " " + y) ;
  }
  public Point()
  { this (0,0) ;  // appel Point (0,0) ; doit etre la premiere instruction
    System.out.println ("constructeur sans argument") ;
  }
  private int x, y ;
}
public class Consthis
{ public static void main (String args[])
  { Point a = new Point (1, 2) ;
    Point b = new Point() ;
  }
}

