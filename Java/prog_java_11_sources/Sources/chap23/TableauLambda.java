interface Calculateur { public int calcul (int n) ; }
public class TableauLambda
{ public static void main (String [] args)
{ Calculateur [] tabCalc = { x -> x*x, x -> 2*x, x -> (int)Math.sqrt (x) } ;
for (Calculateur calc : tabCalc) traite (15, calc) ;
}
public static void traite (int n, Calculateur cal)
{ int res = cal.calcul(n) ;
System.out.println ("calcul(" + n + ") = " + res) ;
}
}