interface Distanciable { public int distance (Point p1, Point p2 ) ; }
public class RefMethClassse
{ public static void main (String [] args)
  { Point p1 = new Point (1, 3), p2 = new Point (3, 8) ;
    Distanciable dlamb = (pp1, pp2) -> pp2.getX() - pp1.getX () ;
    System.out.println ("distance entre p1 et p2 =  " + dlamb.distance(p1, p2)) ;
    Distanciable d1 = Point::distance1 ;   // OK deux arguments type Point, retour int
    System.out.println ("distance1 entre p1 et p2 = " + d1.distance(p1, p2)) ;
    Distanciable d2 = Point::distance2 ;   // OK deux arguments type Point, retour int
    System.out.println ("distance2 entre p1 et p2 = " + d2.distance(p1, p2)) ;
  }
}
class Point
{ public Point (int x, int y ) { this.x = x ; this.y = y ; }
  public int distance1 (Point p) { return p.x - x ; }
  public int distance2 (Point p) { return p.y - y ; }
  public int getX() { return x ; }
  public int getY() { return y ; }
  private int x, y ;
}