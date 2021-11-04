import java.io.* ;
public class EssaiFile
{ public static void main (String args[]) throws IOException
  { File rep1 = new File ("D:\\Exemples\\Test\\Donnees") ; // repert abolu
    File rep2 = new File ("D:\\Exemples\\Resultats\\..\\Test\\Donnees\\..") ;   
    File rep3 = new File ("Essai\\Jour1")           ;      // repert relatif 
    File fic1 = new File (rep1, "chose.txt") ;
    System.out.println ("fic1 : " + fic1) ; // convesion auto de fic1 en String
   
      // Utilisation de methodes syntaxiques
    File rep2Abs = rep2.getAbsoluteFile () ;   
    File rep2Canonic = rep2.getCanonicalFile () ;         // élimination . et ..
    System.out.println ("rep2 absolu :    " + rep2Abs ) ; // ou rep2.getAbsolutePath()  
    System.out.println ("rep2.canonique : " + rep2Canonic) ;
    File parentFic1 = fic1.getParentFile() ;
    File parentRep2 = rep2.getParentFile();
    File parentRep3 = rep3.getParentFile();
    File parentRep2Canonic = rep2Canonic.getParentFile();
    System.out.println ("Parent de fic1 = " + parentFic1 ) ;
    System.out.println ("Parent de rep3 = " + parentRep3 ) ;
    System.out.println ("Parent de rep2 = " + parentRep2 ) ;  // attention
    System.out.println ("Parent de rep2 canonique = " + parentRep2Canonic ) ; 
    System.out.println ("nom fic1 sans chemin =    " + fic1.getName()) ;
    System.out.println ("dernier niveau rep1 =     " + rep1.getName()) ;
     
      // Utilisation de methodes d'information
    System.out.println ("existence rep1 =          " + rep1.exists()) ;
    System.out.println ("rep1 est un fichier =     " + rep1.isFile()) ;
    System.out.println ("rep1 est un repertoire =  " + rep1.isDirectory()) ;
    System.out.println ("existence fic1 =          " + fic1.exists()) ;
    System.out.println ("taille fic1 =             " + fic1.length() ) ;
    System.out.println ("ecriture fic1 autorisee = " + fic1.canWrite()) ;
   }  
}
