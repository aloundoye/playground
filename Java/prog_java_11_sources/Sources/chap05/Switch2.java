public class Switch2
{ public static void main (String[] args)
  { int n ;
    System.out.print ("donnez un nombre entier : ") ;
    n = Clavier.lireInt() ;
    switch (n)
    { case 0 : System.out.println ("nul") ;
      case 1 : System.out.println ("un") ;
      case 3 : System.out.println ("trois") ;
    }
    System.out.println ("Au revoir");
  }
}

