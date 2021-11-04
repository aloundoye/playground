import java.lang.reflect.* ;
public class MethodesClass3
{  public static void main(String args[]) throws IllegalAccessException
   { Point p = new Point() ; 
     Class<?> c = p.getClass() ; 
     Method methodes[] = c.getDeclaredMethods() ;
       // affichage des informations relatives aux methodes de la classe de p
     for (Method methode : methodes)
      { System.out.println ("----- Methode de nom : " + methode.getName()) ; 
        System.out.print ("- type arguments : ") ;
        Class<?> typeArgs [] = methode.getParameterTypes() ;
         for (Class<?> typeArg : typeArgs )
         { System.out.print (typeArg.getName() + " ") ;
         }               
        System.out.println () ;
        Class<?> typeRetour = methode.getReturnType() ;
        System.out.println ("- type valeur de retour : " + typeRetour.getName()) ;
        System.out.println ("- modificateurs : " + methode.getModifiers()) ;
      }
       // affichage des informations relatives aux constructeurs de la classe de p
     Constructor<?> constructeurs [] = c.getDeclaredConstructors () ;
     for (Constructor<?> constructeur : constructeurs)
     { System.out.println ("---- Constructeur de nom : " + constructeur.getName()) ;
       System.out.print ("- type arguments : ") ;
       Class<?> typeArgs [] = constructeur.getParameterTypes() ;
       for (Class<?> typeArg : typeArgs )
       { System.out.print (typeArg.getName() + " ") ;
       }               
      System.out.println () ;
      System.out.println ("- modificateurs : " + constructeur.getModifiers()) ;
     }
   }
}
class Point
{ public Point() { x=0 ; y=0 ; compte++ ;}
  public Point(int x, int y) {this.x = x ; this.y = y ; compte++ ;}
  protected void deplace (int dx, int dy) { x+=dx ; y+= dy ; }
  private void symetrise() { x = -x ; y= -y ; }
  public static void afficheNbre ()
    { System.out.println ("il y a "+compte+ "points") ; } 
  private int x, y ;
  public static int compte=0 ; 
}