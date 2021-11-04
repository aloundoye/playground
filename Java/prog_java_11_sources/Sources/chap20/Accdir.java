import java.io.* ;
public class Accdir
{ public static void main (String args[]) throws IOException
  {
    String nomfich ;
    int n, num ;
    RandomAccessFile entree ;
    System.out.print ("donnez le nom du fichier a consulter : ") ;
    nomfich = Clavier.lireString() ;
    entree = new RandomAccessFile (nomfich, "r") ;

    do
     { System.out.print ("Numero de l'entier recherche : ") ;
       num = Clavier.lireInt() ;
       if (num == 0) break ;
       entree.seek (4*(num-1)) ;
       n = entree.readInt() ;
       System.out.println ("  valeur = " + n) ;
    }
    while (num != 0) ;

    entree.close () ;
    System.out.println ("*** fin consultation fichier ***");
  }
}

