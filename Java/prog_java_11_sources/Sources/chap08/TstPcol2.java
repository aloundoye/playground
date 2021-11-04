   // classe de base
class Point
{ public void initialise (int abs, int ord)
  { x = abs ; y = ord ;
  }
  public void deplace (int dx, int dy)
  { x += dx ; y += dy ;
  }
  public void affiche ()
  { System.out.println ("Je suis en " + x + " " + y) ;
  }
  protected int x, y ;
}
   // classe derivee de Point
class Pointcol extends Point
{ public void colore (byte couleur)
  { this.couleur = couleur ;
  }
  public void affichec ()
  { affiche() ;
    System.out.println ("  et ma couleur est : " + couleur) ;
  }
  public void initialisec (int x, int y, byte couleur)
  { initialise (x, y) ;
    this.couleur = couleur ;
  }
  private byte couleur ;
}
   // classe utilisant Pointcol
public class TstPcol2
{ public static void main (String args[])
  { Pointcol pc1 = new Pointcol() ;
    pc1.initialise (3, 5) ;
    pc1.colore ((byte)3) ;
    pc1.affiche() ;   // attention, ici affiche
    pc1.affichec() ;  // et ici affichec

    Pointcol pc2 = new Pointcol() ;
    pc2.initialisec(5, 8, (byte)2) ;
    pc2.affichec() ;
    pc2.deplace (1, -3) ;
    pc2.affichec() ;
  }
}

