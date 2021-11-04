abstract class Affichable
{ abstract public void affiche() ;
}

class Entier extends Affichable
{ public Entier (int n)
  { valeur = n ;
  }
  public void affiche()
  { System.out.println ("Je suis un entier de valeur " + valeur) ;
  }
  private int valeur ;
}
class Flottant extends Affichable
{ public Flottant (float x)
  { valeur = x ;
  }
  public void affiche()
  { System.out.println ("Je suis un flottant de valeur " + valeur) ;
  }
  private float valeur ;
}
public class Tabhet3
{ public static void main (String[] args)
  { Affichable [] tab ;
    tab = new Affichable [3] ;
    tab [0] = new Entier (25) ;
    tab [1] = new Flottant (1.25f) ; ;
    tab [2] = new Entier (42) ;
    int i ;
    for (i=0 ; i<3 ; i++)
      tab[i].affiche() ;
  }
}


