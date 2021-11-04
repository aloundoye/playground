interface Calculateur { public int calcul (int n) ; }
public class ReturnLambda
{ public static void main (String [] args)
  { for (int i=0 ; i<3 ; i++)
    { traite (4, fabriqueStatique()) ;  }
  }
  public static void traite (int n, Calculateur cal) 
  { int res = cal.calcul(n) ;
    System.out.println ("calcul(" + n + ") = "  + res) ;
  }
  public static Calculateur fabriqueStatique ()     // tire un calculateur au  hasard
  { double x = Math.random() ;
    if (x < 0.5) return xx -> xx * xx ;     // renvoie une expression lambda
            else return xx -> 2 * xx ;      // renvoie une autre expression lambda
  }
}
