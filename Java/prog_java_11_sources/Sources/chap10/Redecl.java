class Point
{ public Point(int x, int y) throws ErrConst
  { if ( (x<=0) || (y<=0)) throw new ErrConst() ;
    this.x = x ; this.y = y ;
  }
  public void f() throws ErrConst
  { try
    { Point p = new Point (-3, 2) ;
    }
    catch (ErrConst e)
    { System.out.println ("dans catch (ErrConst) de f") ;
      throw e ;        // on repasse l'exception à un niveau superieur
    }
  }
  private int x, y ;
}
class ErrConst extends Exception
{ }
public class Redecl
{ public static void main (String args[])
  { try
    { Point a = new Point (1, 4) ;
      a.f() ;
    }
    catch (ErrConst e)
    { System.out.println ("dans catch (ErrConst) de main") ;
    }
  System.out.println ("apres bloc try main") ;
  }
}

