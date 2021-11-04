import java.util.* ;
public class Tri1
{ public static void main (String args[])
  { int nb[] = {4, 9, 2, 3, 8, 1, 3, 5} ;
    ArrayList t = new ArrayList() ;
    for (int i=0 ; i<nb.length ; i++) t.add (new Integer(nb[i])) ;

    System.out.println ("t initial      = " + t) ;
    Collections.sort (t) ;
    System.out.println ("t trie         = " + t) ;
    Collections.shuffle (t) ;
    System.out.println ("t melange      = " + t) ;
    Collections.sort (t, Collections.reverseOrder()) ;
    System.out.println ("t trie inverse = " + t) ;
  }
}

/*
t initial      = [4, 9, 2, 3, 8, 1, 3, 5]
t trie         = [1, 2, 3, 3, 4, 5, 8, 9]
t melange      = [2, 9, 8, 5, 1, 4, 3, 3]
t trie inverse = [9, 8, 5, 4, 3, 3, 2, 1]
*/


