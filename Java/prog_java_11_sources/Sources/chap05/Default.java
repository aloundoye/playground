public class Default
{ public static void main (String[] args)
  { int n ;
    System.out.print ("donnez un nombre entier : ") ;
    n = Clavier.lireInt() ;
    switch (n)
    { case 0 : System.out.println ("nul") ;
               break ;
      case 1 : System.out.println ("un") ;
               break ;
      default : System.out.println ("grand") ;
    }
    System.out.println ("Au revoir");
  }
}

