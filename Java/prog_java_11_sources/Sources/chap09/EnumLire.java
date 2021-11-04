import java.io.* ;

public class EnumLire
{ public static void main (String args[])
  { String chJour ;
    System.out.print("Donnez un jour de la semaine : ");
    chJour = Clavier.lireString () ;
    {
      // première démarche : provoque une exception si la valeur de chJour
      //                     ne représente pas une valeur de type Jour
      Jour courant = Jour.valueOf (chJour) ;  // ou :   Jour courant = Enum.valueOf (chJour) ;
      int numJour = courant.ordinal();
      System.out.println("Methode 1 : " + courant + " est le jour de rang  " + numJour);


      // deuxième démarche
      for (Jour j : Jour.values())
      { if (chJour.equals(j.toString() ) )
        { numJour = j.ordinal() ;
          System.out.println("Methode 2 : " + courant + " est le jour de rang  " + numJour);
        }
      }

    }

  }

}

// classe fournissant des fonctions de lecture au clavier
class Clavier
{ public static String lireString ()   // lecture d’une chaine
  { String ligne_lue = null ;
    try
    { InputStreamReader lecteur = new InputStreamReader (System.in) ;
      BufferedReader entree = new BufferedReader (lecteur) ;
      ligne_lue = entree.readLine() ;
    }
    catch (IOException err)
    { System.exit(0) ;
    }
    return ligne_lue ;
  }
  public static float lireFloat ()   // lecture d’un float
  { float x=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      x = Float.parseFloat(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return x ;
  }
  public static double lireDouble ()   // lecture d’un double
  { double x=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      x = Double.parseDouble(ligne_lue) ;
    }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return x ;
  }
  public static int lireInt ()         // lecture d’un int
  { int n=0 ;   // valeur a lire
    try
    { String ligne_lue = lireString() ;
      n = Integer.parseInt(ligne_lue) ;
      }
    catch (NumberFormatException err)
    { System.out.println ("*** Erreur de donnee ***") ;
      System.exit(0) ;
    }
    return n ;
  }

   // programme de test de la classe Clavier
  public static void main (String[] args)
  { System.out.println ("donnez un flottant") ;
    float x ;
    x = Clavier.lireFloat() ;
    System.out.println ("merci pour " + x) ;
    System.out.println ("donnez un entier") ;
    int n  ;
    n = Clavier.lireInt() ;
    System.out.println ("merci pour " + n) ;
  }
}

enum Jour { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche }
/*
 Donnez un jour de la semaine : mercredi
 Methode 1 : mercredi est le jour de rang  2
 Methode 2 : mercredi est le jour de rang  2
*/
