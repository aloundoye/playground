import java.time.* ;
import java.time.temporal.* ;   // Pour les constantes de ChronoUnit
public class LocDate
{ public static void main (String [] args)   
  { LocalDate aujourdhui = LocalDate.now() ;                    // date du jour
    System.out.println ("Aujourd'hui     : " + aujourdhui) ;
    System.out.println ("Nous sommes un  : " + aujourdhui.getDayOfWeek()) ;
    System.out.println ("Nous sommes le  : " + aujourdhui.getDayOfYear()
                                             + "eme Jour de l'annee") ;
    LocalDate unJour = LocalDate.of(2009, 6, 13) ;               // annee, mois, jour
    System.out.println ("Un jour         : " + unJour) ;
    LocalDate leMemeJour = LocalDate.of(2009, Month.JUNE, 13) ;  // avec nom de mois
    System.out.println ("Le meme jour    : " + leMemeJour) ;
    LocalDate dansTroisMois = aujourdhui.plusMonths(3) ;
    System.out.println ("Dans trois mois : " + dansTroisMois) ;
    System.out.println ("Nous serons en  : " + dansTroisMois.getMonth()) ;
        // calcul ecart entre aujourdhui et unJour et differents affichages
    Period ecart = unJour.until(aujourdhui) ;
    System.out.println ("Ecart           : " + ecart.getYears() + " annees " 
                        + ecart.getMonths() + " mois " + ecart.getDays() + " jours") ;
    System.out.println ("Ecart en mois   : " +ecart.toTotalMonths()) ;
    long nbJours = unJour.until(aujourdhui,ChronoUnit.DAYS) ;
    System.out.println ("Ecart en jours  : " + nbJours) ;
    Period onAjoute = Period.of(1,  2,  3) ;    // 1 an, 2 mois, 3 jours
    LocalDate plusTard = aujourdhui.plus(onAjoute) ;
    System.out.println ("Plus tard       : " + plusTard) ;
  }
}