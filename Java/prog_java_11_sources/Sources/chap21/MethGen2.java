 public class MethGen2
 { static <T> T hasard (T e1, T e2)
   { double x = Math.random() ;
     if (x <0.5) return e1 ;
          else   return e2 ;
   }
    public static void main(String args[])
    { Integer n1 = 2 ;
      Integer n2 = 5 ;
      int n = hasard (n1, n2) ;
      System.out.println ("hasard (n1, n2) = " + n) ;

      Double x1 = 2.5 ;
      Number v = hasard (n1, x1) ;
      System.out.println("hasard 'n1, x1) = " + v ) ;

      Number w = MethGen2.<Number> hasard (n1, x1) ;
      System.out.println("hasard 'n1, x1) = " + v ) ;

      // Number z = MethGen2.<Double>hasard (n1, x1) ;  // rejeté en compilation
    }
  }
/*
hasard (n1, n2) = 2
hasard 'n1, x1) = 2.5
hasard 'n1, x1) = 2
*/

