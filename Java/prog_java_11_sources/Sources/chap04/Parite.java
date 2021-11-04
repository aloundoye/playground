public class Parite
{ public static void main (String args[])
  { int n ;
    System.out.print ("donnez un entier : ") ;
    n = Clavier.lireInt() ;
    if ((n & 1) == 1)
      System.out.println ("il est imair") ;
    else
      System.out.println ("il est pair") ;
  }
}

