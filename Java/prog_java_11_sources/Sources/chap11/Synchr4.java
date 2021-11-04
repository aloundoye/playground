public class Synchr4
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
{ public synchronized void calcul() throws InterruptedException
  { if (!pret)
    { n++ ;
      carre = n*n ;
      pret = true ;
      notifyAll() ;
    }
    else wait() ;
  }
  public synchronized void affiche ()
  { try
    { if (pret)
      { System.out.println (n + " a pour carre " + carre) ;
        notifyAll() ;
        pret = false ;
      }
      else wait () ;
     }
    catch (InterruptedException e) {}
  }
  public boolean pret ()
  { return pret ;
  }
  private int n=1, carre ;
  private boolean pret = false ;
}
// on aurait pu garder les tests sur pret

class ThrChange extends Thread
{ public ThrChange (Nombres nomb)
  { this.nomb = nomb ;
  }
  public void run ()
  { try
    { while (!interrupted())
      { nomb.calcul() ;
        sleep (5) ;
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
        sleep (2) ;
      }
    }
    catch (InterruptedException e) {}
  }
  private Nombres nomb ;
}

/*
56 a pour carre 3136
57 a pour carre 3249
58 a pour carre 3364
59 a pour carre 3481
60 a pour carre 3600
61 a pour carre 3721
62 a pour carre 3844
63 a pour carre 3969
64 a pour carre 4096
65 a pour carre 4225
66 a pour carre 4356
67 a pour carre 4489
68 a pour carre 4624
69 a pour carre 4761
70 a pour carre 4900
71 a pour carre 5041
72 a pour carre 5184
73 a pour carre 5329
74 a pour carre 5476
75 a pour carre 5625

*/
