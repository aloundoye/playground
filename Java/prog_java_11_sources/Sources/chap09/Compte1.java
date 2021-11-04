public class Compte1
{ public static void main (String args[])
  { final char car = 'e' ;
    int i, posCar ;
    int nbCar = 0 ;
    String ch ;
    System.out.print ("donnez un mot : ") ;
    ch = Clavier.lireString() ;
    i = 0 ;
    do
    { posCar = ch.indexOf(car, i) ;
      if (posCar>=0) { nbCar++ ;
                       i = posCar+1 ;
                     }
    }
    while (posCar>=0) ;
    System.out.println ("votre mot comporte "  + nbCar
                        + " fois le caractere " + car) ;
  }
}

