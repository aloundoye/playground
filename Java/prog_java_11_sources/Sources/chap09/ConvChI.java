public class ConvChI
{ public static void main (String args[])
  { String ch ;
    while (true)    // on s'arretera quand chaine vide
    { System.out.print ("donnez une chaine (vide pour finir) : ") ;
      ch = Clavier.lireString() ;
      if (ch.length()==0) break ;
      int n = Integer.parseInt(ch) ;
      System.out.println ("  entier correspondant " + n) ;
    }
  }
}


