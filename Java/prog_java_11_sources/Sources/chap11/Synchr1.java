public class Synchr1
{ public static void main (String args[])
  { Nombres nomb = new Nombres() ;
    Thread calc = new ThrCalc (nomb) ;
    Thread aff  = new ThrAff (nomb) ;
    System.out.println ("Suite de carres - tapez retour pour arreter") ;
    calc.start() ; aff.start() ;
    Clavier.lireString() ;
    calc.interrupt() ; aff.interrupt() ;
  }
}
class Nombres
{ public synchronized void calcul()
  { n++ ;
    carre = n*n ;
  }
  public synchronized void affiche ()
  { System.out.println (n + " a pour carre " + carre) ;
  }
  private int n=0, carre ;
}

class ThrCalc extends Thread
{ public ThrCalc (Nombres nomb)
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
1 a pour carre 1
2 a pour carre 4
4 a pour carre 16
5 a pour carre 25
7 a pour carre 49
8 a pour carre 64
10 a pour carre 100
11 a pour carre 121
13 a pour carre 169
14 a pour carre 196
16 a pour carre 256
17 a pour carre 289
*/
