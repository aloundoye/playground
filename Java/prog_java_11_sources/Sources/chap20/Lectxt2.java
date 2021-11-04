import java.io.* ;
import java.util.* ;    // pour StringTokenizer
public class Lectxt2
{ public static void main (String args[]) throws IOException
  { String nomfich ;
    int nombre, carre ;
    System.out.print ("donnez le nom du fichier a lister : ") ;
    nomfich = Clavier.lireString() ;
    BufferedReader entree = new BufferedReader (new FileReader (nomfich)) ;

    System.out.println ("Nombres et carres contenus dans ce fichier") ;
    while (true)
     { String ligneLue = entree.readLine() ;
           if (ligneLue == null) break ;
       StringTokenizer tok = new StringTokenizer (ligneLue, " ") ;
       nombre = Integer.parseInt (tok.nextToken()) ;
       for (int i=0 ; i<3 ; i++)  tok.nextToken() ;  // pour sauter : a pour carre
       carre = Integer.parseInt (tok.nextToken()) ;
       System.out.println (nombre + " " + carre) ;
     }
    entree.close () ;
    System.out.println ("*** fin liste fichier ***");
 }
}



