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
public class JokerMeth
{ public static void main (String args[])
  { Couple <Double> cd = new Couple<Double> (2.5, 3.5) ;
    calcul (cd) ;

  }
  public static  void calcul (Couple<T> c)
  {

  }
}

