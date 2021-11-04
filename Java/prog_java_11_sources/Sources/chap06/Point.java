public class Point
{ public void initialise (int abs, int ord)
  { x = abs ;
    y = ord ;
  }
  public void deplace (int dx, int dy)
  { x += dx ;
    y += dy ;
  }
  public void affiche ()
  { System.out.println ("Je suis un point de coordonnees " + x + " " + y) ;
  }
  private int x ;   // abscisse
  private int y ;   // ordonnee
}

