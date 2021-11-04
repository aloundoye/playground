abstract class Logo
{ abstract void affiche () ;
}
class LogoCercle extends Logo
{ public void affiche () { System.out.println ("Logo circulaire") ; }
}
class LogoRectangle extends Logo
{ public void affiche () { System.out.println ("Logo rectangle") ; }
}
class FabriqueLogoHasard
{ public Logo getLogo()
  { double x = Math.random () ;
    if (x < 0.5) return new LogoCercle () ; 
            else return new LogoRectangle () ;
  }
}
public class TestFabrique1
{ public static void main (String args[])
  { FabriqueLogoHasard fab = new FabriqueLogoHasard () ;
    for (int i = 0 ; i<4 ; i++) 
    { Logo l = fab.getLogo() ;
      l.affiche();
    }  
  }
}