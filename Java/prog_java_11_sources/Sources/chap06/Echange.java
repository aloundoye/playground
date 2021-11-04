class Util
{ public static void echange (int a, int b)  // ne pas oublier static
  { System.out.println ("debut echange : " + a + " " + b) ;
    int c ;
    c = a ;
    a = b ;
    b = c ;
    System.out.println ("fin echange   : " + a + " " + b) ;
  }
}
public class Echange
{ public static void main (String args[])
  { int n = 10, p = 20 ;
    System.out.println ("avant appel   : " + n + " " + p) ;
    Util.echange (n, p) ;
    System.out.println ("apres appel   : " + n + " " + p) ;
  }
}          


