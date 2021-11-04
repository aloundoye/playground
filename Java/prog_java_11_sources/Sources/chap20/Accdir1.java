import java.io.* ;
public class Accdir1
{ public static void main (String args[]) throws IOException
  {
    String nomfich ;
    int n, num ;
    RandomAccessFile entree ;
    System.out.print ("donnez le nom du fichier a consulter : ") ;
    nomfich = Clavier.lireString() ;
    entree = new RandomAccessFile (nomfich, "r") ;
    long taille = entree.length() ;

    do
    { System.out.print ("Numero de l'entier recherche : ") ;
      num = Clavier.lireInt() ;
      if (num == 0) break ;
      int rang = 4*(num-1) ;
      if ( (rang>0) && (rang<taille))
             { entree.seek (rang) ;
               n = entree.readInt() ;
               System.out.println ("  valeur = " + n) ;
             }
        else { System.out.println ("entier inexistant") ;
               continue ;
             }
    }
    while (num != 0) ;

    entree.close () ;
    System.out.println ("*** fin consultation fichier ***");
  }
}

