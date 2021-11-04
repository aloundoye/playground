public class Couple1
{ public static void main (String args[])
  { Integer oi1 = new Integer (3) ;
    Integer oi2 = new Integer (5) ;
    Couple <Integer> ci  = new Couple (oi1, oi2) ;
    ci.affiche () ;

    Couple <Double>  cd = new Couple <Double>  (2.0, 12.0) ;
    cd.affiche() ;
    Double p = cd.getPremier () ;
    System.out.println ("premier element du couple cd = " + p ) ;
  }
}
class Couple<T>
{ private T x, y ;      // les deux elements du couple
  public Couple (T premier, T second)
  { x = premier ; y = second ;
  }
  public T getPremier ()
  { return x ; }
  public void affiche ()
  { System.out.println ("premiere valeur : " + x + " - deuxieme valeur : " + y ) ;
  }
}
