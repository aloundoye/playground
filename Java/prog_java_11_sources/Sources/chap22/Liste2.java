import java.util.* ;
public class Liste2
{ public static void main (String args[])
  { LinkedList<String> l = new LinkedList<String>() ;
                                                  // LinkedList l = new LinkedList() ;   <-- avant JDK5.0
      /* on ajoute a la liste tous les mots lus au clavier */
    System.out.println ("Donnez une suite de mots (vide pour finir)") ;
    while (true)
    { String ch = Clavier.lireString() ;
      if (ch.length() == 0) break ;
      l.add (ch) ;
    }

    System.out.println ("Liste des mots a l'endroit :") ;
    ListIterator<String> iter = l.listIterator() ;
                           // ListIterator iter = l.listIterator() ;   <-- avant JDK5.0
    while (iter.hasNext()) System.out.print (iter.next() + " ") ;
    System.out.println () ;
    System.out.println ("Liste des mots a l'envers :") ;
    iter = l.listIterator(l.size()) ;  // iterateur en fin de liste
    while (iter.hasPrevious()) System.out.print (iter.previous() + " ") ;
    System.out.println () ;
  }
}
