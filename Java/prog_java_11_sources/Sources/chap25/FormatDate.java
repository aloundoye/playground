import java.time.* ;
import java.time.format.* ;
public class FormatDate
{ public static void main (String [] args)
  { LocalDate aujourdhui = LocalDate.now();
    String dateCourte 
      = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(aujourdhui) ;
    System.out.println ("Date (SHORT)        : " + dateCourte) ;
    String dateComplete 
      = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(aujourdhui) ;
    System.out.println ("Date (FULL)         : " + dateComplete) ;
    LocalTime maintenant = LocalTime.now() ;
    String heureCourte 
      = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(maintenant) ;
    System.out.println ("Heure (SHORT)       : " + heureCourte) ;
    String heureMedium 
      = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(maintenant) ;
    System.out.println ("Heure (MEDIUM)      : " + heureMedium) ;
    LocalDateTime maintenant2 = LocalDateTime.now() ;
    String dateHeureComplete 
      =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(maintenant2) ;
    System.out.println ("Date+heure (MEDIUM) : " + dateHeureComplete) ;
    String dateFormatBasic = DateTimeFormatter.BASIC_ISO_DATE.format(aujourdhui) ;
    System.out.println ("Date BASIC_ISO_DATE :" + dateFormatBasic) ;
  }
}