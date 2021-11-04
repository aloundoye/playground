public class Demons
{ public static void main (String args[])
  { Ecrit e1 = new Ecrit ("bonjour ", 5) ;
    Ecrit e2 = new Ecrit ("bonsoir ", 10) ;
    Ecrit e3 = new Ecrit ("\n", 35) ;
    e1.setDaemon (true) ; e1.start() ;
    e2.setDaemon (true) ; e2.start() ;
    e3.setDaemon (true) ; e3.start() ;
    Clavier.lireString() ;  // met fin au main, donc ici
                            // aux trois autres threads démons
  }
}
class Ecrit extends Thread
{ public Ecrit (String texte, long attente)
  { this.texte = texte ;
    this.attente = attente ;
  }
  public void run ()
  { try
    {  while (true)     // boucle infinie
       { if (interrupted()) return ;
         System.out.print (texte) ;
         sleep (attente) ;
       }
    }
    catch (InterruptedException e)
    { return ;   // on peut omettre return ici
    }
  }

  private String texte ;
  private long attente ;
}

/*
*/
