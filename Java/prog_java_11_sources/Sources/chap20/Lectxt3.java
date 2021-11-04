import java.io.* ;
import java.util.* ;    // pour StringTokenizer
public class Lectxt3
{ public static void main (String args[]) throws IOException
  { String nomfich ;
    double x, som = 0. ;
    System.out.print ("donnez le nom du fichier a lister : ") ;
    nomfich = Clavier.lireString() ;
    BufferedReader entree = new BufferedReader (new FileReader (nomfich)) ;

    System.out.println ("Flottants contenus dans le fichier " + nomfich + " :") ;

    while (true)
     { String ligneLue = entree.readLine() ;
           if (ligneLue == null) break ;
       StringTokenizer tok = new StringTokenizer (ligneLue, " ") ;  // espace separateur
       int nv = tok.countTokens() ;
       for (int i=0 ; i<nv ; i++)
       { x = Double.parseDouble (tok.nextToken()) ;
         som += x ;
         System.out.println (x + " ") ;
       }
      }
    entree.close () ;
    System.out.println ("somme des nombres = " + som) ;
    System.out.println ("*** fin liste fichier ***");
  }
}


