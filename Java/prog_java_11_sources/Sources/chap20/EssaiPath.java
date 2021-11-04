import java.nio.file.* ;  // pour Path et Paths 
import java.io.* ;
public class EssaiPath
{ public static void main (String args[]) throws IOException
  { Path rep1 = Paths.get ("D:\\Exemples\\Test\\Donnees") ;   // repert abolu
    Path rep2 = Paths.get ("D:\\Exemples\\Resultats\\..\\Test\\Donnees\\..") ;   
    Path rep3 = Paths.get ("Essai\\Jour1") ;      // repert relatif 
    Path fic1 = Paths.get ("D:\\Exemples\\Test\\Donnees", "chose.txt") ;
    System.out.println ("fic1 : " + fic1) ;      // convesion auto de fic1 en String
        // Utilisation de methodes syntaxiques
    Path rep2Abs = rep2.toAbsolutePath () ;   // methode de classe ici
    Path rep2Canonic = rep2.normalize () ;    // methode de classe ici
    System.out.println ("rep2 absolu :    " + rep2Abs ) ;       
    System.out.println ("rep2.canonique : " + rep2Canonic) ;  
    Path parentFic1 = fic1.getParent () ;
    Path parentRep2 = rep2.getParent () ;
    Path parentRep3 = rep3.getParent () ;
    Path parentRep2Canonic = rep2Canonic.getParent ();
    System.out.println ("Parent de fic1 = " + parentFic1 ) ;
    System.out.println ("Parent de rep3 = " + parentRep3 ) ;
    System.out.println ("Parent de rep2 = " + parentRep2 ) ;  // attention au resultat
    System.out.println ("Parent de rep2 canonique = " + parentRep2Canonic ) ; 
    System.out.println ("nom fic1 sans chemin =    " + fic1.getFileName ()) ;
    System.out.println ("dernier niveau rep1 =     " + rep1.getFileName ()) ;
         // Utilisation de methodes d'information
    System.out.println ("existence rep1 =          " + Files.exists(rep1)) ;
    System.out.println ("rep1 est un fichier =     " + Files.isRegularFile(rep1)) ;
    System.out.println ("rep1 est un repertoire =  " + Files.isDirectory(rep1)) ;
    System.out.println ("existence fic1 =          " + Files.exists(fic1)) ;
    System.out.println ("taille fic1 =             " + Files.size(rep1) ) ;
    System.out.println ("ecriture fic1 autorisee = " + Files.isWritable(fic1)) ;
   } 
 }
