interface Affichable
{ public void affiche() ;
}
public class Anonym2
{ public static void main (String[] args)
  { Affichable a ;
    a = new Affichable()
          { public void affiche ()
            { System.out.println ("Je suis un anonyme implementant Affichable") ;
            }
          } ;
    a.affiche() ;  
  }
}


