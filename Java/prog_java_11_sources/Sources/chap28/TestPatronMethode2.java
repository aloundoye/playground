abstract class Forme
{ public void affiche ()
  { afficheNature () ; 
    System.out.println ("-- Coordonnees = " + x + " " + y) ;
    afficheAutresInfos () ;
  }
  abstract public void afficheNature () ;  // a redefinir obligatoirement
  public void afficheAutresInfos () { }    // version par defaut si pas redefinie
  protected int x, y ;        // pour eviter pb acces dans classes derivees
}
class Point extends Forme
{ public Point (int x, int y) { this.x = x ; this.y = y ; }
  public void afficheNature () { System.out.println ("Je suis un Point") ; }
  // ici, on ne redefinit pas afficheAutresInfos
}
class Cercle extends Forme
{ public Cercle (int x, int y, double r) 
  { this.x = x ; this.y = y ; this.r = r ; }
  private double r ; 
  public void afficheNature () { System.out.println ("Je suis un Cercle") ; }
  public void afficheAutresInfos ()
  { System.out.println ("-- Rayon = " + r) ; }
}
public class TestPatronMethode2
{ public static void main (String args[])
  { Point p = new Point(2, 5) ;
    p.affiche () ;
    Cercle c = new Cercle(3, 8, 4.5) ;
    c.affiche ();
  }
}