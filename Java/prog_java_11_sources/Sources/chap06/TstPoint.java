public class TstPoint
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

