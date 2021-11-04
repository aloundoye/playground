class Point
{ public Point(int x, int y) throws ErrConst
  { if ( (x<=0) || (y<=0)) throw new ErrConst() ;
    this.x = x ; this.y = y ;
  }
  public void deplace (int dx, int dy) throws ErrDepl
  { if ( ((x+dx)<0) || ((y+dy)<0)) throw new ErrDepl() ;
    x += dx ; y += dy ;
  }  
  public void affiche()
  { System.out.println ("coordonnees : " + x + " " + y) ;
  }
  private int x, y ;
}
class ErrConst extends Exception
{ }
class ErrDepl extends Exception
{ }
public class Suitex
{ public static void main (String args[])
  { try
    { Point a = new Point (1, 4) ;
      a.affiche() ;
      a.deplace (-3, 5) ;
      a = new Point (-3, 5) ;
      a.affiche() ;
    }
    catch (ErrConst e)
    { System.out.println ("Erreur construction ") ;
      System.exit (-1) ;
    }
    catch (ErrDepl e)
    { System.out.println ("Erreur deplacement ") ;
      System.exit (-1) ;
    }
  }
}

