class Point
{ public Point(int x, int y) throws ErrConst
  { if ( (x<=0) || (y<=0)) throw new ErrConst() ;
    this.x = x ; this.y = y ;
  }
  public void f() throws ErrConst, ErrBidon
  { try
    { Point p = new Point (-3, 2) ;
    }
    catch (ErrConst e)
    { System.out.println ("dans catch (ErrConst) de f") ;
      throw new ErrBidon() ;        // on lance une nouvelle exception
    }
   }
  private int x, y ;
}
class ErrConst extends Exception
{ }
class ErrBidon extends Exception
{}
public class Redecl1
{ public static void main (String args[])
  { try
    { Point a = new Point (1, 4) ;
      a.f() ;
    }
    catch (ErrConst e)
    { System.out.println ("dans catch (ErrConst) de main") ;
    }
    catch (ErrBidon e)
    { System.out.println ("dans catch (ErrBidon) de main") ;
    }
    System.out.println ("apres bloc try main") ;  
  }
}

