public class Break
{ public static void main (String args[])
  { int i ;
    for (i=1 ; i<=10 ; i++)
    { System.out.println ("debut tour " + i) ;
      System.out.println ("bonjour") ;
      if (i==3) break ;
      System.out.println ("fin tour  " + i) ;
    }
    System.out.println ("apres la boucle") ;
  }
}

