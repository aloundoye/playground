abstract class Affichable  
{ abstract void affiche () ; 
}
class Point extends Affichable
{ public Point (int x, int y) { this.x = x ; this.y = y ; }
  public void affiche ()
  { System.out.println ("coordonnees = " + x + " " + y ) ; }
  private int x, y ;
}
class Coloration extends Affichable
{ Coloration (Affichable p, int c) { this.p = p ; this.c = c ; }
  public void affiche () { p.affiche(); System.out.println ("+++ couleur " + c ) ; }
  private Affichable p ;
  private int c ;
}
class Forme extends Affichable
{ Forme (Affichable p, char f) {this.p = p ; this.f = f ; }
  public void affiche () { p.affiche(); System.out.println ("+++ forme " + f ) ; }
  private Affichable p ;
  private char f ;
}

public class TestDecorateur
{ public static void main (String args [])
  {  Affichable pc = new Coloration (new Point(6, 5), 10) ;
     pc.affiche() ;
     Affichable pf = new Forme (new Point(1, 4), '*') ;
     pf.affiche () ;
     Affichable pcf = new Forme (pc, '+') ;
     pcf.affiche () ;
  }
}