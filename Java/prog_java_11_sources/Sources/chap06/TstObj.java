class Obj
{ public Obj()
  { System.out.print ("++ creation objet Obj ; ") ;
    nb ++ ;
    System.out.println ("il y en a maintenant " + nb) ;
  }
  private static long nb=0 ;
}
public class TstObj
{ public static void main (String args[])
  { Obj a ;
    System.out.println ("Main 1") ;
    a = new Obj() ;
    System.out.println ("Main 2") ;
    Obj b ;
    System.out.println ("Main 3") ;
    b = new Obj() ;
    Obj c = new Obj() ;
    System.out.println ("Main 4") ;
  }
}

