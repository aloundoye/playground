import java.time.Instant;
public class BoucleDuree
{ public static void main (String [] args)
  { final int DUREE_BOUCLE_MS = 2500 ;  // ou long
    // .....
    Instant maintenant = Instant.now() ;
    System.out.println ("Debute a : " + maintenant) ;
    Instant fin = maintenant.plusMillis(DUREE_BOUCLE_MS) ;
    do { // traitement
         maintenant = Instant.now() ;
       }
    while (fin.isAfter(maintenant)) ;
    System.out.println ("Fini a :   " + maintenant) ;
  }
}