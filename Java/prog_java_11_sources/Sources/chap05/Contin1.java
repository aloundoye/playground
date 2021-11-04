public class Contin1
{ public static void main (String args[])
  { int i ;
    for (i=1 ; i<=5 ; i++)
    { System.out.println ("debut tour " + i) ;
      if (i<4) continue ;
      System.out.println ("fin tour  " + i) ;
    }
    System.out.println ("apres la boucle") ;
  }
}

