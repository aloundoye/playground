public class Switch3
{ public static void main (String[] args)
  { int n ;
    System.out.print ("donnez un nombre entier : ") ;
    n = Clavier.lireInt() ;
    switch (n)
    { case 0 : System.out.println ("nul") ;
               break ;
      case 1 :
      case 2 : System.out.println ("petit") ;
      case 3 :
      case 4 :
      case 5 : System.out.println ("moyen") ;
               break ;
      default : System.out.println ("grand") ;
    }
    System.out.println ("Au revoir");
  }
}

