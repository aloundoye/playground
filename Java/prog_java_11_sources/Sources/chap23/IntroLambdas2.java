interface Calculateur { public int calcul (int n) ; }
public class IntroLambda2
{ public static void main (String args [])
{ int n1 = 5, n2 = 3 ;
Calculateur carre = x -> x * x ;
int res = carre.calcul(n1) ;
System.out.println ("Carre de " + n1 + " = " + res) ;
System.out.println ("Carre de " + n2 + " = " + carre.calcul(n2)) ;
}
}