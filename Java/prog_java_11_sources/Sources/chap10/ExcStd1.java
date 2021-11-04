public class ExcStd1
{ public static void main (String args[])
  { try
    { int t[] ;
      System.out.print ("taille voulue : ") ;
      int n = Clavier.lireInt() ;
      t = new int[n] ;
      System.out.print ("indice : ") ;
      int i = Clavier.lireInt() ;
      t[i] = 12 ;
      System.out.println ("*** fin normale") ;
     }
     catch (NegativeArraySizeException e)
     { System.out.println ("Exception taille tableau negative : " + e.getMessage() ) ;
     }
     catch (ArrayIndexOutOfBoundsException e)
     { System.out.println ("Exception indice tableau : " + e.getMessage() ) ;
     }
  }
}


