public class ConvICh
{ public static void main (String args[])
  { int n ;
    while (true)    // on s'arretera quand n == 0
    { System.out.print ("donnez un entier (0 pour finir) : ") ;
      n = Clavier.lireInt() ;
      if (n==0) break ;
      String ch = String.valueOf(n) ;
      System.out.println ("  chaine correspondante, de longueur "
                          + ch.length() + " : " + ch) ;
    }
  }
}


