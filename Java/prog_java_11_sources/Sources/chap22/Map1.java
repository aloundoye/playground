import java.util.* ;
public class Map1
{ public static void main (String args[])
  { HashMap <String, String> m = new HashMap <String, String> () ;
                                       // HashMap m = new HashMap() ;  <-- avant JDK5.0
    m.put ("c", "10") ; m.put ("f", "20") ; m.put ("k", "30") ;
    m.put ("x", "40") ; m.put ("p", "50") ; m.put ("g", "60") ;
    System.out.println ("map initial :                        " + m) ;

    // retrouver la valeur associee a la cle "f"
    String ch = m.get("f") ;       // String ch = (String)m.get("f") ; <-- avant JDK5.0
    System.out.println ("valeur associee a f :                " + ch) ;

    // ensemble des valeurs (attention, ici Collection, pas Set)
    Collection<String> valeurs = m.values () ;
                                  // Collection valeurs = m.values() ;  <- avant JDK5.0
    System.out.println ("liste des valeurs initiales :        " + valeurs) ;
    valeurs.remove ("30") ; // on supprime la valeur "30" par la vue associee
    System.out.println ("liste des valeurs apres sup :        " + valeurs) ;

    // ensemble des cles
    Set<String> cles = m.keySet () ;        // Set cles = m.keySet() ; <-- avant JDK5.0
    System.out.println ("liste des cles initiales :           " + cles) ;
    cles.remove ("p") ;   // on supprime la cle "p" par la vue associee
    System.out.println ("liste des cles apres sup :           " + cles) ;

    // modification de la valeur associee a la clé x
    String old = m.put("x", "25") ;
                             // String old = (String)m.put("x", "25") ; <- avant JDK5.0
    if (old != null)
    System.out.println ("valeur associee a x avant modif :    " + old) ;
    System.out.println ("map apres modif de x :               " + m) ;
    System.out.println ("liste des valeurs apres modif de x : " + valeurs) ;

    // On parcourt les entrees (Map.Entry) du map jusqu'a trouver la valeur 20
    // et on supprime l'element correspondant (suppose exister)
    Set<Map.Entry<String, String> > entrees = m.entrySet () ;
    Iterator<Map.Entry<String, String> > iter = entrees.iterator() ;
                                     // Set entrees = m.entrySet () ;  <-- avant JDK5.0
                                     // Iterator iter = entrees.iterator() ;         <-

    while (iter.hasNext())
    { Map.Entry<String, String> entree = iter.next() ;
      String valeur = entree.getValue() ;
                        // Map.Entry entree = (Map.Entry)iter.next() ; <-- avant JDK5.0
                        // String valeur = (String)entree.getValue() ;               <-
      if (valeur.equals ("20"))
        { System.out.println ("valeur 20 " + "trouvee en cle "
                              + entree.getKey()) ;
          iter.remove() ; // suppression sur la vue associee
          break ;
        }
    }
    System.out.println ("map apres sup element suivant 20 :   " + m) ;


    // on supprime l'element de cle "f"
    m.remove ("f") ;
    System.out.println ("map apres suppression f :            " + m) ;
    System.out.println ("liste des cles apres suppression f : " + cles) ;
    System.out.println ("liste des valeurs apres supp de f  : " + valeurs) ;
  }
}

