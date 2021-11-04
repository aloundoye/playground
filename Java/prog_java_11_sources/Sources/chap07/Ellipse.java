public class Ellipse
{ public static void main (String args[])
  { System.out.println (somme (2, 8, 9) ) ;
    System.out.println (somme () );
    System.out.println (somme (3) ) ;
  }

  static int somme (int ... valeurs)
  { int s = 0 ;
    for (int v : valeurs)
      s += v ;
    return s ;
  }
}
/*
19
0
3
*/
