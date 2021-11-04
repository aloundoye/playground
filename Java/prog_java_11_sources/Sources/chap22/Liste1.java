import java.util.* ;
public class Liste1
{ public static void main (String args[])
  { LinkedList<String> l = new LinkedList<String>() ;
                                //  LinkedList l = new LinkedList() ;  <-- avant JDK5.0
    System.out.print ("Liste en A : ") ; affiche (l) ;
    l.add ("a") ; l.add ("b") ;  // ajouts en fin de liste
    System.out.print ("Liste en B : ") ; affiche (l) ;

    ListIterator<String> it = l.listIterator() ;
                                //  LinkedList l = new LinkedList() ;  <-- avant JDK5.0
    it.next() ; // on se place sur le premier élement
    it.add ("c") ; it.add ("b") ;  // et on ajoute deux elements
    System.out.print ("Liste en C : ") ; affiche (l) ;

    it = l.listIterator() ;
    it.next() ; // on progresse d'un element
    it.add ("b") ; it.add ("d") ;     // et on ajoute deux elements
    System.out.print ("Liste en D : ") ; affiche (l) ;

    it = l.listIterator (l.size()) ;   // on se place en fin de liste
    while (it.hasPrevious())     // on recherche le dernier b
    { String ch = it.previous() ;
                            //  String ch = (String) it.previous() ;   <-- avant JDK5.0
      if (ch.equals ("b"))
      { it.remove() ;  // et on le supprime
        break ;
      }
    }
    System.out.print ("Liste en E : ") ; affiche (l) ;

    it = l.listIterator() ;
    it.next() ; it.next() ;   // on se place sur le deuxieme element
    it.set ("x") ;            // qu'on remplace par "x"
    System.out.print ("Liste en F : ") ; affiche (l) ;
  }
  public static void affiche (LinkedList<String> l)
                         // public static void affiche (LinkedList l)  <-- avant JDK5.0
  { ListIterator<String> iter = l.listIterator ();
                            // ListIterator iter = l.listIterator ();  <-- avant JDK5.0
    while (iter.hasNext()) System.out.print (iter.next() + " ") ;
    System.out.println () ;
  }
}

