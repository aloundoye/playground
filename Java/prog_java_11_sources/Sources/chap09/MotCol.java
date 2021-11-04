public class MotCol
{ public static void main (String args[])
  { String mot ;
    System.out.print ("donnez un mot : ") ;
    mot = Clavier.lireString() ;
    System.out.println ("voici votre mot en colonne :") ;
    for (int i=0 ; i<mot.length() ; i++)
      System.out.println (mot.charAt(i)) ;
  }
}

