import java.util.* ;
interface AbscisseObservable 
{ public void enregistre (ObservateurDAbscisses obs);
  public void prevenir(); 
}
abstract class ObservateurDAbscisses
{ public abstract void actualise (AbscisseObservable p) ;
}
class ObservateurDePoints extends ObservateurDAbscisses
{ public void actualise (AbscisseObservable obj) // impossibe d’utiliser Point ici
  { if (obj instanceof Point)
        System.out.println ("Nouvelle abscisse " + ((Point)obj).getX()
                          + " du point de nom " + ((Point)obj).getNom() ) ;
  }
}
class Pixel  
{ public Pixel (int x, int y)
  { this.x = x ; this.y = y ; }
  public void deplace (int dx, int dy)
  { x += dx ; y += dy ; }
  public int getX () { return x ; }
  private int x, y ;
}
class Point extends Pixel implements AbscisseObservable 
{ public Point (String nom, int x, int y)
  { super (x, y) ; this.nom = nom ;
    listeObs = new ArrayList <ObservateurDAbscisses> () ;
  }
  public void deplace (int dx, int dy)
  { super.deplace (dx, dy) ;
    if (dx != 0) prevenir () ;
  }
  public String getNom () { return nom ; }
  public void enregistre (ObservateurDAbscisses obs) { listeObs.add (obs) ; }
  public void prevenir() 
  { for (ObservateurDAbscisses obs : listeObs) { obs.actualise(this) ; }
  }
  private ArrayList<ObservateurDAbscisses> listeObs ;
  private String nom ;
}
public class TestObservateurInt 
{ public static void main (String args[])
  { ObservateurDePoints of = new ObservateurDePoints () ;
    Point p1 = new Point("A", 3, 5) ;
    Point p2 = new Point ("B", 2, 2) ;
    p1.deplace (3, 9) ;   // ici, on n'est pas prevenu
    p1.enregistre (of) ;  // of observe maintenant p1
    p1.deplace (2, 8) ;   // ici, on est prevenu pour p1
    p2.deplace (3, 2) ;   //   mais pas pour p2
    p2.enregistre(of) ;   // of observe maintenant p1 et p2 
    p1.deplace (1, 8) ;   // ici, on est prevenu pour p1
    p2.deplace (2, 2) ;   //   et pour p2
  }
}