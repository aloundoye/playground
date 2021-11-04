public class CoupleHerit
{ public static void main (String args[])
  { Object o1 = null; Integer i1 = 5 ;
    Object o2 = null ; Integer i2 = 3 ;
     Couple1 <Object> co = new Couple1 (o1, o2) ;
     Couple1 <Integer> ci = new Couple1 (i1, i2) ;
    Couple1<?> cq ;
    cq = ci ;
    cq.compare(i1) ;

  }
}
class Couple1<T>
{ private T x, y ;
  public Couple1 (T premier, T second)
  { x = premier ; y = second ;  }
  public T getPremier ()
  { return x ; }
  public boolean comparePremier (T tiers)
  { if (x == tiers) return true ;
               else return false ;
  }

  public void setPremier (T premier)
  { x = premier ; }
  public void affiche ()
  { System.out.println ("premiere valeur : " + x + " - deuxieme valeur : " + y ) ;  }
}
