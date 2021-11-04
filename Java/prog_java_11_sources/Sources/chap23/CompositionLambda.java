interface Calculateur         { public int calcul (int n) ; }
interface FabriqueCalculateur { Calculateur fabrique () ; }
public class CompositionLambda
{ public static void main (String [] args)
  { FabriqueCalculateur fabriqueCarre  = () -> ( xx -> xx * xx ) ;
    FabriqueCalculateur fabriqueDouble = () -> xx -> 2 * xx ;
    traite (12, fabriqueCarre.fabrique()) ;
    traite (25, fabriqueDouble.fabrique()) ;
  }
  public static void traite (int n, Calculateur cal) 
  { int res = cal.calcul(n) ;
    System.out.println ("calcul(" + n + ") = "  + res) ;
  }
}