public class Synchr1a
{ public static void main (String args[])
  { Nombres nomb = new Nombres() ;
    Thread calc = new ThrChange (nomb) ;
    Thread aff  = new ThrAff (nomb) ;
    System.out.println ("Suite de carres - tapez retour pour arreter") ;
    calc.start() ; aff.start() ;
    Clavier.lireString() ;
    calc.interrupt() ; aff.interrupt() ;
  }
}
class Nombres
{ public /* synchronized */ void calcul()
  { n++ ;
    try
    { Thread.sleep (100) ;
    }
    catch (InterruptedException e) {}
    carre = n*n ;
  }
  public /* synchronized */ void affiche ()
  { System.out.println (n + " a pour carre " + carre) ;
  }
  private int n=0, carre ;
}

class ThrChange extends Thread
{ public ThrChange (Nombres nomb)
  { this.nomb = nomb ;
  }
  public void run ()
  { try
    { while (!interrupted())
      { nomb.calcul () ;
        sleep (50) ;
      }
    }
    catch (InterruptedException e) {}
  }
  private Nombres nomb ;
}
class ThrAff extends Thread
{ public ThrAff (Nombres nomb)
  { this.nomb = nomb ;
  }
   public void run ()
  { try
    { while (!interrupted())
      { nomb.affiche() ;
        sleep (75) ;
      }
    }
      catch (InterruptedException e) {}
  }
  private Nombres nomb ;
}

/*

*/
