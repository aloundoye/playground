public class MethGen1
 { static <T> T hasard (T [] valeurs)
   { int n = valeurs.length ;
     if (n == 0) return null ;
     int i = (int) (n * Math.random() ) ;
     return valeurs[i] ;
   }
    public static void main(String args[])
    {  Integer[] tabi = { 1, 5, 8, 4, 9} ;
       System.out.println ("hasard sur tabi = " + hasard (tabi) ) ;
       String [] tabs = { "bonjour", "salut", "hello"} ;
       System.out.println ("hasard sur tabs = " + hasard (tabs) ) ;
    }
  }
/*
  hasard sur tabi = 9
  hasard sur tabs = hello
*/
