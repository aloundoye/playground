public class CoupleH
{ public static void main (String args[])
  { Integer oi1 = 3 ;    // équivalent à :    Integer oi1 = new Integer (3) ;
    Integer oi2 = 5 ;     // équivalent à :    Integer oi2 = new Integer (5) ;
    Couple <Integer> ci  = new Couple<Integer> (oi1, oi2) ;
    ci.affiche () ;
    Couple <Double>  cd = new Couple <Double>  (2.0, 12.0) ;
              // on peut fournir des arguments de type double qui seront
              // convertis automatiquement en Double
    cd.affiche() ;
    Double p = cd.getPremier () ;
    System.out.println ("premier element du couple cd = " + p ) ;


    System.out.println (cd instanceof Couple) ;
    System.out.println (cd instanceof Couple<Double>) ;
    System.out.println (cd instanceof Couple<String>) ;
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
/*
 premiere valeur : 3 - deuxieme valeur : 5
 premiere valeur : 2.0 - deuxieme valeur : 12.0
 premier element du couple cd = 2.0
*/
