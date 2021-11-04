import java.util.function.* ;    // pour intUnaryOperator
public class LambdaRappel2
{ public static void main (String [] args)
  { traite (5,   x -> x *x) ;
    traite (12,  x -> 2*x*x + 3*x + 5) ;
  }
  public static void traite (int n, IntUnaryOperator cal) 
  { int res = cal.applyAsInt(n) ;
    System.out.println ("calcul (" + n + ") = "  + res) ;
  }
}
