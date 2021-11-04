import java.lang.reflect.* ; // pour les méthodes de Class
public class MethodesClass1 
{  public static void main (String args[])
   { Point p = new Point() ;
     Class<?> c = p.getClass() ; 
   
     Field[] champs = c.getDeclaredFields() ; 
     System.out.println ("--- Champs de Point :") ;
     for (Field champ : champs)  System.out.print (champ.getName() + " ") ;
     System.out.println () ;
   
     Method[] methodes = c.getMethods () ;
     System.out.println ("--- Noms de toutes les methodes de Point :") ;
     for (Method methode : methodes)  System.out.print (methode.getName() + " ") ;
     System.out.println();
   
     Method[] methodesd = c.getDeclaredMethods () ;
     System.out.println ("--- Noms des methodes declarees de Point :") ;
     for (Method methoded : methodesd) System.out.print(methoded.getName() + " ") ;
     System.out.println () ;
   
     Constructor <?>[] constructeurs = c.getDeclaredConstructors() ;
     System.out.println ("--- Constructeurs de Point :") ;
     for (Constructor<?> constructeur : constructeurs)
       System.out.println (constructeur.getName());
   }
}
class Point
{ public Point() { x=0 ; y=0 ; compte++ ;}
  public Point(int x, int y) {this.x = x ; this.y = y ; compte++ ;}
  public void deplace (int dx, int dy) { x+=dx ; y+= dy ; }
  private void symetrise() { x = -x ; y= -y ; }
  public static void afficheNbre ()
    { System.out.println ("il y a "+compte+ "points") ; } 
  private int x, y ;
  public static int compte=0 ;
}