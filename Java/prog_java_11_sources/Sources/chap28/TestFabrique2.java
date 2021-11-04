abstract class Logo
{ abstract void affiche () ;
}
class LogoCercle extends Logo
{ public void affiche () { System.out.println ("Logo circulaire") ; }
}
class LogoRectangle extends Logo
{ public void affiche () { System.out.println ("Logo rectangle") ; }
}
abstract class FabriqueLogo
{ public abstract Logo getLogo() ;
}
public class FabriqueLogoHasard extends FabriqueLogo
{ public Logo getLogo()
  { double x = Math.random () ;
    if (x < 0.5) return new LogoCercle () ; 
            else return new LogoRectangle () ;
  }
}


class FabriqueLogoAlternes extends FabriqueLogo
{ public Logo getLogo ()
  {  if (indic) { indic = false ; return new LogoCercle() ; }
           else { indic = true ;  return new LogoRectangle () ; }  
  }
  public static boolean indic = false ;
}
public class TestFabrique2
{ public static void main (String args[])
  { FabriqueLogo fab ;
    fab = new FabriqueLogoHasard () ;
    System.out.println ("--- avec Fabrique au hasard") ;
    for (int i = 0 ; i<4 ; i++) 
    { Logo l = fab.getLogo() ;
      l.affiche();
    }  
    fab = new FabriqueLogoAlternes () ;
    System.out.println ("--- avec Fabrique alternee") ;
    for (int i = 0 ; i<4 ; i++) 
    { Logo l = fab.getLogo() ;
      l.affiche();
    }
  }
}