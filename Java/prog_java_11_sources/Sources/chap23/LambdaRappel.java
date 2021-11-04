interface Calculateur { public int calcul (int n) ; }
public class LambdaRappel
{ public static void main (String [] args)
{ traite (5, x -> x*x) ;
traite (12, x -> 2*x*x + 3*x + 5) ;
}
public static void traite (int n, Calculateur cal)
{ int res = cal.calcul(n) ;
System.out.println ("calcul (" + n + ") = " + res) ;
}
}