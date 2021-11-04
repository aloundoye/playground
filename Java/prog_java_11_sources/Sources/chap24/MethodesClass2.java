import java.lang.reflect.*;
public class MethodesClass2
{  public static void main(String args[])
   { Point p = new Point() ;
     Class<?> c = p.getClass() ; 
     Field champs[] = c.getDeclaredFields() ;
       // affichage des informations relatives aux champs de la classe de p
     for (Field champ : champs) 
      { System.out.println ("---- Champ de nom : " + champ.getName()) ; 
        System.out.println ("type : " + champ. getType().getName()) ;
        int mod = champ.getModifiers();
        System.out.println ("modificateurs : " + mod) ;
        if (Modifier.isPrivate(mod)) System.out.println ("prive") ;
        if (Modifier.isStatic(mod))  System.out.println ("static") ;
        
      }
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
  protected int z ;  
}