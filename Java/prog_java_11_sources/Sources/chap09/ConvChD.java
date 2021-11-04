public class ConvChD
{ public static void main (String args[])
  { String ch ;
    while (true)    // on s'arretera quand chaine vide
    { System.out.print ("donnez une chaine (vide pour finir) : ") ;
      ch = Clavier.lireString() ;
      if (ch.length()==0) break ;
      double x = Double.parseDouble(ch) ;
      System.out.println ("  double correspondant " + x) ;
    }
  }
}


