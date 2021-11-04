public class TriCh
{ public static void main (String args[])
  { String tabCh [] = {"java", "c", "pascal", "c++", "ada", "basic", "fortran" } ;
    String temp ;    // pour l'echange de deux references
    int i, j ;
    int nbCh = tabCh.length ;
    for (i=0 ; i<nbCh-1 ; i++)
      for (j=i ; j<nbCh ; j++)
        if ( (tabCh[i].compareTo(tabCh[j])) > 0)
          { temp = tabCh [i] ;
            tabCh [i] = tabCh [j] ;
            tabCh [j] = temp ;
          }
    System.out.println ("chaines triees : ");
    for (i=0 ; i<nbCh ; i++)
      System.out.println (tabCh[i]) ;
  }
}


