class A
{ public void affiche()
  { System.out.println ("Je suis un A") ;
  }
}
public class Anonym1
{ public static void main (String[] args)
  { A a ;
    a = new A() { public void affiche ()
                  { System.out.println ("Je suis un anonyme derive de A") ;
                  }
                } ;
    a.affiche() ;  
  }
}


