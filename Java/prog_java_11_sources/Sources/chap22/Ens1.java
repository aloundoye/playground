import java.util.* ;
public class Ens1
{ public static void main (String args[])
  { int t[] = {2, 5, -6, 2, -8, 9, 5} ;
    HashSet<Integer>ens = new HashSet<Integer>() ;
                                      // HashSet ens = new HashSet() ; <-- avant JDK5.0
       /* on ajoute des objets de type Integer */
    for (int v : t)               // for (int i=0 ; i< t.length ; i++) <-- avant JDK5.0
    { boolean ajoute = ens.add(v) ;
                   //  boolean ajoute = ens.add (new Integer (t[i])) ; <-- avant JDK5.0
      if (ajoute) System.out.println ("  On ajoute " + v) ;
               // if(ajoute) System.out.println("  On ajoute "+t[i]) ; <-- avant JDK5.0
        else System.out.println ("  " + v + " est deja present") ;
                   // else System.out.println ("  " + t[i] + " est deja present") ; <--
    }
    System.out.print ("Ensemble en A = ") ; affiche (ens) ;
       /* on supprime un eventuel objet de valeur Integer(5) */
    Integer cinq = 5 ;             // Integer cinq = new Integer (5) ; <-- avant JDK5.0
    boolean enleve = ens.remove (cinq) ;
    if (enleve) System.out.println ("  On a supprime 5") ;
    System.out.print ("Ensemble en B = ") ; affiche (ens) ;
       /* on teste la presence de Integer(5) */
    boolean existe = ens.contains (cinq) ;
    if (!existe) System.out.println ("  On ne trouve pas 5") ;
  }
  public static <E> void affiche (HashSet<E> ens)
                          // public static void affiche (HashSet ens)  <-- avant JDK5.0
  { Iterator<E> iter = ens.iterator () ;       // Iterator iter = ens.iterator () ; <--
    while (iter.hasNext())
    { System.out.print (iter.next() + " ") ;
    }
    System.out.println () ;
  }
}
