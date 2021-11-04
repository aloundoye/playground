public class While1
{ public static void main (String args[])
  { int n, som ;
    som = 0 ;
    while (som < 100)
     { System.out.print ("donnez un nombre : ") ;
       n = Clavier.lireInt() ;
       som += n ;
     }
    System.out.println ("Somme obtenue : " + som) ;
  }
}


