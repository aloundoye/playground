
public class Tva
{ public static void main (String[] args)
  { double taux_tva = 21.6 ;
    double ht, ttc, net, tauxr, remise ;
    System.out.print ("donnez le prix hors taxes : ") ;
    ht = Clavier.lireDouble() ;

    ttc = ht * ( 1. + taux_tva/100.) ;
    if ( ttc < 1000.)            tauxr = 0 ;
       else if ( ttc < 2000 )    tauxr = 1. ;
          else if ( ttc < 5000 ) tauxr = 3. ;
             else                tauxr = 5. ;

    remise = ttc * tauxr / 100. ;
    net = ttc - remise ;
    System.out.println  ("prix ttc     " + ttc) ;
    System.out.println  ("remise       " + remise) ;
    System.out.println  ("net a payer  " + net) ;
 }
}

