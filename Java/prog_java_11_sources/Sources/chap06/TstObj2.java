class Obj
{ public Obj()
  { System.out.print ("++ creation objet Obj ; ") ;
    nb ++ ;
    System.out.println ("il y en a maintenant " + nb) ;
  }
  public static long nbObj ()
  { return nb ;
  }
  private static long nb=0 ;
}
public class TstObj2
{ public static void main (String args[])
  { Obj a ;
    System.out.println ("Main 1 : nb objets = " + Obj.nbObj() ) ;
    a = new Obj() ;
    System.out.println ("Main 2 : nb objets = " + Obj.nbObj() ) ;
    Obj b ;
    System.out.println ("Main 3 : nb objets = " + Obj.nbObj() ) ;
    b = new Obj() ;
    Obj c = new Obj() ;
    System.out.println ("Main 4 : nb objets = " + Obj.nbObj() ) ;
  }
}

