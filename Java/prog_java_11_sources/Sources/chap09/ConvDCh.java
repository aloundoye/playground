public class ConvDCh
{ public static void main (String args[])
  { double x ;
    while (true)    // on s'arretera quand n == 0
    { System.out.print ("donnez un double (0 pour finir) : ") ;
      x = Clavier.lireDouble() ;
      if (x==0.) break ;
      String ch = String.valueOf(x) ;
      System.out.println ("  chaine correspondante, de longueur "
                          + ch.length() + " : " + ch) ;
    }
  }
}


