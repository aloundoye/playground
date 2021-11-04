public class ArgMain
{ public static void main (String args[])
  { int nbArgs = args.length ;
    if (nbArgs == 0) System.out.println ("pas d'arguments") ;
    { for (int i=0 ; i<nbArgs ; i++)
        System.out.println ("argument numero " + i+1 + " = " + args[i]) ;
    }
  }
}


