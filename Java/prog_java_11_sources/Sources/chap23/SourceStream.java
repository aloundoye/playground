import java.util.stream.* ;
import java.util.* ;
public class SourceStream
{ public static void main (String [] args)
  { Integer tabObj [] = { 3, 8, 2, -4, 0, 12, 8, -5, 3, -4, 15} ;
    System.out.println ("-- Filtrage des >0 avec une collection :") ;
    List<Integer> liste = Arrays.asList(tabObj) ;
    liste.stream().filter(ee -> ee>0).forEach (ee -> System.out.print (ee + " ")) ;
    System.out.println ("\n-- Filtrage des >0 avec une collection, en parallele :") ;
    liste.parallelStream().filter(ee -> ee>0)
                          .forEach (ee -> System.out.print (ee + " ")) ;
    System.out.println ("\n-- Idem (en parallele) avec forEachOrdered :") ;
    liste.parallelStream().filter(ee -> ee>0)
                          .forEachOrdered (ee -> System.out.print (ee + " ")) ;
    System.out.println ("\n-- Filtrage des pairs avec une liste de valeurs") ;
    Stream.of (1, 8, -3, 5, -11, 3, 7, 12, 5).filter(ee -> 2*(ee/2)==ee)
                          .forEach (ee -> System.out.print (ee + " ")) ;
    System.out.println ("\n-- Filtrage des >0 avec un tableau") ;
    Stream.of (tabObj).filter(ee -> ee >0)    // ereur compil si tab de type int
                          .forEach (ee -> System.out.print (ee +" ")) ;
    System.out.println 
           ("\n-- Avec generation valeurs aleatoires entieres entre 0 et 9") ;
    Stream.generate(Math::random).limit(8).map(ee -> (int)(ee*10))
                          .forEach(ee -> System.out.print (ee + " ")) ;
    System.out.println ("\n-- Avec methode iterative") ;
    Stream.iterate(15, (ee -> 2 * ee )).limit(10)
              .forEach (ee -> System.out.print (ee +" ")) ;
    }
}