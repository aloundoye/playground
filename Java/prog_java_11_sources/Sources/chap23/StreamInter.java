import java.util.stream.*;
import java.util.* ;
public class StreamInter
{ public static void main (String [] args)
  { Integer [] tab = { 2, 15, -3, 2, -5, 34, 23, 4, -8, 12 } ;
    System.out.println ("--- Carres des negatifs, double des positifs") ;
    Stream.of(tab).map( e -> { if (e>0) return 2*e ; //  ici, on peut aussi
                               else return e*e; }    //  utiliser mapToInt
                             )                       
                  .forEach (e -> System.out.print (e + " ")) ;
    System.out.println ("\n--- Valeurs et nombre de negatifs") ;
    long nb_neg = Stream.of(tab).filter(e -> e<0)
                                .peek(e -> System.out.print(e + " "))
                                .count() ;    
    System.out.println (" ** Nombre de negatifs : "+nb_neg) ;
    System.out.println ("--- Valeurs triees ordre naturel :") ;
    Stream.of(tab).sorted().forEach (e -> System.out.print (e + " ")) ;
    System.out.println 
         ("\n--- Valeurs triees ordre naturel en parallele, avec forEachOrdered :") ;
    Stream.of(tab).parallel().sorted()     // Notez ici : forEachOrdered
                  .forEachOrdered (e -> System.out.print (e + " ")) ;
    System.out.println ("\n--- Valeurs triees ordre inverse, sans doublons :") ;
    Stream.of(tab).sorted(Comparator.reverseOrder()) // impossible si int[] tab
                  .distinct() 
                  .forEach (e -> System.out.print (e + " ")) ;
  }
}