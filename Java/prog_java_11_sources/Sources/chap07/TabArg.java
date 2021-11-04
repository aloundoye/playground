public class TabArg
{ public static void main (String args[])
  { int t[] = { 1, 3, 5, 7} ;
    System.out.print ("t avant : ") ;
    Util.affiche (t) ;
    Util.raz (t) ;
    System.out.print ("\nt apres : ") ;
    Util.affiche (t) ;
  }
}
class Util
{ static void raz (int t[])
  { for (int i=0 ; i<t.length ; i++)   // ici for... each pas appicable
      t[i] = 0 ;
  }
  static void affiche (int t[])
  { for (int i=0 ; i<t.length ; i++)   // ou (depuis JDK5.0) :
      System.out.print (t[i] + " ") ;  // for (int v : t) System.out.print (v + " ") ;  
  }
}
