import java.util.* ;
public class Array2
{ public static void main (String args[])
  { ArrayList v = new ArrayList () ;
     /* on introduit 10 elements de type Integer */
    for (int i=0 ; i<10 ; i++) v.add (new Integer(i)) ;
     /* puis 4 elements de type String */
    v.add (2, "AAA") ;  // en position 2
    v.add (4, "BBB") ;  // en position 4
    v.add (8, "CCC") ;  // en position 8
    v.add (5, "DDD") ;  // en position 5
    System.out.println ("En I   : contenu de v = " + v) ;
      /* on remplace tous les objets de type chaine par la reference null */
    for (int i = 0 ; i<v.size() ; i++)
      if (v.get(i) instanceof String) v.set (i, null) ;
    System.out.println ("En II  : contenu de v = " + v) ;

      /* on cree une nouvelle collection (ici une liste) contenant deux      */
      /* elements : une reference a un objet Integer (5), une reference null */
     LinkedList l = new LinkedList () ;
     l.add (new Integer (5)) ; l.add (null) ;
     v.removeAll (l) ;
     System.out.println ("En III : contenu de v = " + v) ;
  }
}

/*
En I   : contenu de v = [0, 1, AAA, 2, BBB, DDD, 3, 4, 5, CCC, 6, 7, 8, 9]
En II  : contenu de v = [0, 1, null, 2, null, null, 3, 4, 5, null, 6, 7, 8, 9]
En III : contenu de v = [0, 1, 2, 3, 4, 6, 7, 8, 9]
*/



