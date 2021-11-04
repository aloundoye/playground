import java.util.* ;
public class EnsOp
{ public static void main (String args[])
  { int t1[] = {2,    5, 6,    8, 9} ;
    int t2[] = {   3,    6, 7,    9} ;
    HashSet <Integer> e1 = new HashSet <Integer>(), e2 = new HashSet<Integer> () ;
                 // HashSet e1 = new HashSet(), e2 = new HashSet() ;   <-- avant JDK5.0
    for (int v : t1)  e1.add (v) ;
             //  for (int i=0 ; i< t1.length ; i++) e1.add (new Integer (t1[i])) ;
    for (int v : t2) e2.add (v) ;
             //  for (int i=0 ; i< t2.length ; i++) e2.add (new Integer (t2[i])) ;
    System.out.println ("e1 = " + e1) ; System.out.println ("e1 = " + e2) ;

    // reunion de e1 et e2 dans u1
    HashSet <Integer>  u1 = new HashSet <Integer> () ;
                                      // HashSet u1 = new HashSet () ; <-- avant JDK5.0
    copie (u1, e1) ;  // copie e1 dans u1
    u1.addAll (e2) ;
    System.out.println ("u1 = " + u1) ;

    // intersection de e1 et e2 dans i1
    HashSet <Integer> i1 = new HashSet <Integer> () ;
                                      // HashSet i1 = new HashSet () ; <-- avant JDK5.0
    copie (i1, e1) ;
    i1.retainAll (e2) ;
    System.out.println ("i1 = " + i1) ;
  }

  public static <E> void copie (HashSet<E> but, HashSet<E> source)
             // public static void copie (HashSet but, HashSet source) <-- avant JDK5.0
  { Iterator<E> iter = source.iterator() ;
                              // Iterator iter = source.iterator () ;  <-- avant JDK5.0
    while (iter.hasNext())
    { but.add (iter.next()) ;
    }
  }
}
