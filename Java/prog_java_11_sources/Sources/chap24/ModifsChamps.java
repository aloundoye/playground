import java.lang.reflect.*;
public class ModifsChamps
{  public static void main(String args[])throws IllegalAccessException
   { Point p1 = new Point() ; Point p2= new Point(5,9) ;
     Class<?> c = p1.getClass() ; 
     Field champs[] = c.getDeclaredFields() ;
         // Récupération des valeurs du premier champ de p1 et de p2
     int xp1 = champs[0].  getInt(p1) ;  // on suppose le type (int) connu
     Object xp2 = champs[0].get(p2) ;    // on ne suppose pas de type particulier
                                         // on obtiendra un objet de type Integer
     System.out.println ("type de xp2 = " + xp2.getClass().getName()) ;
     System.out.println ("Pour p1, champ " + champs[0].getName() + " = " + xp1) ;
     System.out.println ("Pour p2, champ " + champs[1].getName() + " = " + xp2) ;
       // Modification des valeurs du premier champ de p1 et de p2    
     Integer io = 100 ;
     champs[0].set(p2,io) ;  
     champs[1].setInt(p1, 999) ;
     System.out.println ("Pour p1, champ " + champs[0].getName() 
             + " = " + champs[0].getInt(p1));
     System.out.println ("Pour p2, champ " + champs[1].getName() 
             + " = " + champs[1].getDouble(p2)) ;
     System.out.print ("appel affiche sur p1 - ") ; p1.affiche();
     System.out.print ("appel affiche sur p2 - ") ; p2.affiche();
   }
}
class Point
{ public Point () { x=0; y=0; }
  public Point (int x, int y) { this.x = x ; this.y = y ; }
  void affiche () { System.out.println ("coordonnees : " + x + " " + y) ; }
  public int x, y ;
}
