import javax.swing.* ;
public class Etats extends JApplet
{  public Etats ()
   { System.out.println ("Construction") ;
   }
   public void init ()
   { System.out.println ("Appel init") ;
   }
   public void start ()
   { System.out.println ("Appel start") ;
   }
   public void stop ()
   { System.out.println ("Appel stop") ;
   }
   public void destroy ()
   { System.out.println ("Appel destroy") ;
   }
}


