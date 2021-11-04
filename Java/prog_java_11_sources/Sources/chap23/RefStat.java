interface Calculateur { public int calcul (int n) ; }
public class RefStat
{ public static void main (String [] args)
  { traite (5, RefStat::carre) ;    // au lieu de : traite (5, x -> x*x) ; 
    traite (12, RefStat::trinome) ; // au lieu de : traite (12, x -> 2*x*x + 3*x +5)
  }
  public static void traite (int n, Calculateur cal) 
  { int res = cal.calcul(n) ;
    System.out.println ("calcul (" + n + ") = "  + res) ;
  }
  public static int carre (int n)   { return n * n ; }       // meme types que calcul
  public static int trinome (int n) { return 2*n*n + 3*n + 5 ; }   // idem
}