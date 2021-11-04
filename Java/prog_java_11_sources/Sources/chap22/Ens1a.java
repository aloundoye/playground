import java.util.* ;
public class Ens1a
{ public static void main (String args[])
  { int t[] = {2, 5, -6, 2, -8, 9, 5} ;
    TreeSet ens = new TreeSet() ;
       /* on ajoute des objets de type Integer */
    for (int i=0 ; i< t.length ; i++)
    { boolean ajoute = ens.add (new Integer (t[i])) ;
      if (ajoute) System.out.println ("  On ajoute " + t[i]) ;
             else System.out.println ("  " + t[i] + " est deja present") ;
    }
    System.out.print ("Ensemble en A = ") ; affiche (ens) ;
       /* on supprime un eventuel objet de valeur Integer(5) */
    Integer cinq = new Integer (5) ;
    boolean enleve = ens.remove (cinq) ;
    if (enleve) System.out.println ("  On a supprime 5") ;
    System.out.print ("Ensemble en B = ") ; affiche (ens) ;
       /* on teste la presence de Integer(5) */
    boolean existe = ens.contains (cinq) ;
    if (!existe) System.out.println ("  On ne trouve pas 5") ;
Clavier.lireInt();
  }
  public static void affiche (Set ens)
  { Iterator iter = ens.iterator () ;
    while (iter.hasNext())
    { System.out.print (iter.next() + " ") ;
    }
    System.out.println () ;
  }
}

/*
  On ajoute 2
  On ajoute 5
  On ajoute -6
  2 est deja present
  On ajoute -8
  On ajoute 9
  5 est deja present
Ensemble en A = -8 -6 2 5 9
  On a supprime 5
Ensemble en B = -8 -6 2 9
  On ne trouve pas 5
*/


