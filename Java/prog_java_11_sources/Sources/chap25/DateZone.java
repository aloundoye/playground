import java.time.* ;
public class DateZone
{ public static void main (String [] args)
  { ZonedDateTime maintenant = ZonedDateTime.now();  // par defaut dans local
    System.out.println ("Maintenant     : " + maintenant) ;
    System.out.println ("Nous sommes un : "+ maintenant.getDayOfWeek()) ;
    ZoneId idChicago = ZoneId.of("America/Chicago") ;
    ZonedDateTime aChicago = maintenant.withZoneSameInstant(idChicago) ;
    System.out.println ("Maintenant a Chicago      : " + aChicago) ;
    System.out.println ("C'est un : "+ maintenant.getDayOfWeek()) ;
    if (maintenant.isEqual(aChicago)) System.out.println ("Dates/heures identiques") ;
    ZoneOffset offsetChicago = aChicago.getOffset() ;
    System.out.println ("Offset de Chicago : " + offsetChicago.getTotalSeconds()) ; 
                                                          // en secondes uniquement
          // franchissement du changement d'heure hiver -> ete
    LocalDateTime dateHeureLocale = LocalDateTime.of(2014, 3, 25, 16, 30) ;
    ZonedDateTime dateHeure = ZonedDateTime.of(dateHeureLocale,
                                               ZoneId.of("Europe/Paris")) ;
    System.out.println ("Date_Heure initiale       : " + dateHeure) ;
    ZonedDateTime dateHeure30 = dateHeure.plusDays(30) ;
    System.out.println ("Date_Heure + 30 jours     : " + dateHeure30) ;
    ZonedDateTime dateHeure30x24 = dateHeure.plusHours(30*24) ;
    System.out.println ("Date_Heure + 30*24 heures : " + dateHeure30x24) ;
    Period trenteJours = Period.ofDays(30) ;
    ZonedDateTime dateHeurePeriode = dateHeure.plus(trenteJours) ;
    System.out.println ("Date_Heure + periode 30 j : " + dateHeurePeriode) ;
    Duration duree = Duration.ofDays(30) ;
    ZonedDateTime dateHeureDuree = dateHeure.plus(duree) ;
    System.out.println ("Date_Heure + duree 30 j   : " + dateHeureDuree) ;
  }
}