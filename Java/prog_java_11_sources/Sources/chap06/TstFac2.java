class Util
{ public static long fac (long n)
  { long res ;
    System.out.println ("** entree dans fac : n = " + n) ;
    if (n<=1) res = 1 ;
     else res = fac(n-1) * n ;
    System.out.println ("** sortie de fac :   res = " + res) ;
    return res ;
  }
}
public class TstFac2
{ public static void main (String [] args)
  { int n ;
    System.out.print ("donnez un entier positif : ") ;
    n = Clavier.lireInt() ;
    System.out.println ("Voici sa factorielle : " + Util.fac(n) ) ;
  }
}
     
