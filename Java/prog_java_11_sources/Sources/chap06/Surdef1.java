class Point
{ public Point (int abs, int ord)  // constructeur
  { x = abs ;  y = ord ;
  }
  public void deplace (int dx, int dy)  // deplace  (int, int)
  { x += dx ; y += dy ;
  }
  public void deplace (int dx)          // deplace  (int)
  { x += dx ;
  }
  public void deplace (short dx)        // deplace  (short)
  { x += dx ;
  }
  private int x, y ;
}
public class Surdef1
{ public static void main (String args[])
  { Point a = new Point (1, 2) ;
    a.deplace (1, 3) ; // appelle deplace (int, int)
    a.deplace (2) ;    // appelle deplace (int)
    short p = 3 ;
    a.deplace (p) ;    // appelle deplace (short)
    byte b = 2 ;
    a.deplace (b) ;    // appelle deplace (short) apres conversion de b en short
  }
}


