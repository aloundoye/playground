public class Do1
{ public static void main (String args[])
  { int n ;
    do
     { System.out.print ("donnez un nombre >0 : ") ;
       n = Clavier.lireInt() ;
       System.out.println ("vous avez fourni " + n) ;
     }
    while (n <= 0) ;
    System.out.println ("reponse correcte") ;
  }
}

