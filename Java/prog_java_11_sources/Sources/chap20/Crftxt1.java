import java.io.* ;
public class Crftxt1
{ public static void main (String args[]) throws IOException
  {
    String nomfich ;
    int n ;
    System.out.print ("Donnez le nom du fichier a creer : ") ;
    nomfich = Clavier.lireString() ;
    PrintWriter sortie = new PrintWriter (new FileWriter (nomfich)) ;

    do
      { System.out.print ("donnez un entier : ") ;
        n = Clavier.lireInt() ;
        if (n != 0)
         { sortie.println (n + " a pour carre " + n*n)  ;
         }
      }
    while (n != 0) ;
    sortie.close () ;
    System.out.println ("*** fin creation fichier ***");
  }
}


