import java.util.stream.*;
import java.util.* ;
public class StreamTer
{ public static void main (String [] args)
  {     // max, min, sum, average sur un IntStream
    int [] tab = { 2, 15, -3, 2, -5, 34, 23, 4, -8, 12 } ;
    OptionalInt max =  IntStream.of(tab).max() ;
        // exploitation de max avec isPresent
    if (max.isPresent())
      System.out.println ("Max pos de tab avec isPresent = " + max.getAsInt()) ;
        // exploitation de max avec orElse (par convention ici 0 si valeur absente)
    System.out.println ("Max pos de tab avec orElse =    " + max.orElse(0)) ;  
        // exploitation de max avec ifPresent    
    max.ifPresent(xx -> System.out.println ("Max pos de tab avec ifPresent = "
                                             + max.getAsInt()));
    int somme = IntStream.of(tab).filter(ee->ee>0).sum() ;
    System.out.println ("Somme des positifs de tab : " + somme) ;
    OptionalDouble moyenne = IntStream.of(tab).filter(ee->ee<0).average() ;
    if (moyenne.isPresent())
       System.out.println ("Moyenne des <0 de tab = " + moyenne.getAsDouble()) ;
    else System.out.println ("Aucun nombre <0 dans tab") ;
    System.out.println ("Somme des >0 de tab : " + somme) ;
        // max sur un Stream<Integer>
    Integer [] tabObj = { 2, 15, -3, 2, -5, 34, 23, 4, -8, 12 } ;
    Optional<Integer> maxObj =  Stream.of(tabObj)
                                        .max(Comparator.naturalOrder()) ;
    if (maxObj.isPresent())
       System.out.println ("Max des positifs de tabObj = " + maxObj.get()) ;
  }
}