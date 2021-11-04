class Point
{ public Point(int x, int y) throws ErrConst
  { if ( (x<0) || (y<0))
     throw new ErrConst("Erreur construction avec coordonnees " + x + " " + y) ;
    this.x = x ; this.y = y ;
  }
  public void affiche()
  { System.out.println ("coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
class ErrConst extends Exception
{ ErrConst (String mes)
  { super(mes) ;
  }
}
public class Exinfo2
{ public static void main (String args[])
  { try
    { Point a = new Point (1, 4) ;
      a.affiche() ;
      a = new Point (-3, 5) ;
      a.affiche() ;
    }
    catch (ErrConst e)
    { System.out.println (e.getMessage()) ;
      System.exit (-1) ;
    }
  }
}

