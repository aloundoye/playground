public class TstInter
{ public static void main (String args[])
  { Ecrit e1 = new Ecrit ("bonjour ", 5) ;
    Ecrit e2 = new Ecrit ("bonsoir ", 10) ;
    Ecrit e3 = new Ecrit ("\n", 35) ;
    e1.start() ;
    e2.start() ;
    e3.start() ;
    Clavier.lireString();
    e1.interrupt() ;     // interruption premier thread
    System.out.println ("\n*** Arret premier thread ***") ;
    Clavier.lireString();
    e2.interrupt() ;     // interruption deuxième thread
    e3.interrupt() ;     // interruption troisième thread
    System.out.println ("\n*** Arret deux derniers threads ***") ;
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
bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour

bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour
bonsoir
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonjour bonsoir bonjour bonjour bonsoir bonjour
bonjour bonsoir bonjour bonsoir bonjour bonsoir
bonjour bonsoir bonjour bonsoir
bonjour bonsoir bonjour bonjour bonsoir
bonjour bonsoir bonjour bonsoir wbonjour
bonjour bonsoir

*** Arret premier thread ***
bonsoir bonsoir bonsoir
bonsoir bonsoir
bonsoir bonsoir
bonsoir bonsoir
xbonsoir bonsoir
bonsoir bonsoir
bonsoir

*** Arret deux derniers threads ***
*/
