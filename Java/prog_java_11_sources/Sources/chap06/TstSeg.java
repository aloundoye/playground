class Segment
{ class Point
  { public void affiche()
    { System.out.println ("coordonnees : " + x + " " + y) ;
    }
    public Point (int x, int y)
    { this.x = x ; this.y = y ;
    }
    private int x, y ;
  }
  public Segment (int xd, int yd, int xf, int yf, byte c)
  { orig =   new Point (xd, yd) ;
    extrem = new Point (yf, yf) ;
    this.c = c ;
  }
  public void affiche()
  {
  }
  private Point orig, extrem ;
  private byte c ;
}
public class TstSeg
{ public static void main (String args[])
  { Segment s = new Segment (1, 3, 5, 9, (byte)2) ;
    s.affiche() ;
  }
}


