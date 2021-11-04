class Cercle
{ class Centre    // définition interne a Cercle
  { public Centre (int x, int y)
    { this.x = x ; this.y = y ;
    }
    public void affiche()
    { System.out.println (x + ", " + y) ;
    }
    private int x, y ;
  }
  public Cercle (int x, int y, double r)
  { c = new Centre (x, y) ;
    this.r = r ;
  }
  public void affiche ()
  { System.out.print ("cercle de rayon " + r + " de centre ") ;
    c.affiche() ;
  }
  public void deplace (int dx, int dy)
  { c.x += dx ; c.y += dy ;   // ici, on a bien acces à x et y
  }
  private Centre c ;
  private double r ;
}

public class TstCercl
{ public static void main (String args[])
  { Cercle c1 = new Cercle(1, 3, 2.5) ;
    c1.affiche() ;
    c1.deplace (4, -2) ;
    c1.affiche() ;
  }
}

