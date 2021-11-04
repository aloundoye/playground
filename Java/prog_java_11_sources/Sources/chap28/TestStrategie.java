abstract class ModeAffichage
{ public abstract void presente (int x, int y) ; }
class AffichageCourt extends ModeAffichage
{ public void presente (int x, int y)
  { System.out.println (x + " " + y) ; }
}
class AffichageLong extends ModeAffichage
{ public void presente (int x, int y)
  { System.out.println ("abscisse = " + x + " ordonnee = " + y) ; }
}
class Point
{ public Point (int x, int y, ModeAffichage mode)
  { this.x = x ; this.y = y ; this.mode = mode ; }
  void affiche () { mode.presente(x, y) ; }  
  private int x, y ;
  private ModeAffichage mode ;   // strategie d'affichage
}
public class TestStrategie 
{ public static void main (String args[])
  { ModeAffichage court = new AffichageCourt () ;  
    Point p1 = new Point (2, 9, court ) ;
    p1.affiche () ;
    Point p2 = new Point (4, 7, new AffichageLong () ) ;
    p2.affiche () ;
  }  
}