class Point
{ public Point(int x, int y) throws ErrConst
  { if ( (x<0) || (y<0)) throw new ErrConst() ;
    this.x = x ; this.y = y ;
  }
  private int x, y ;
}
class ErrConst extends Exception
{ }
public class Finally
{ public static void main (String args[])
  { try
    { System.out.println ("debut bloc try du main") ;
      System.out.print ("donnez un entier : ") ;
      int n = Clavier.lireInt() ;
      Point a = new Point (n, n) ;
      System.out.println ("fin bloc try du main") ;
    }
    catch (ErrConst e)
    { System.out.println ("dans catch (ErrConst) de main") ;
    }
    finally
    { System.out.println ("execution du bloc finally") ;
    }
    System.out.println ("apres bloc try main") ;
  }
}

