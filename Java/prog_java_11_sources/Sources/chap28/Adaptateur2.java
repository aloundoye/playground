interface Pixel
{ void affiche () ;
  void deplace (int dx, int dy) ;
}
class PointX   
{ public PointX (int x, int y) { this.x =  x ; this.y = y ; }
  public void montre() { System.out.println ("Coordonnees = " + x + " " + y) ; }
  public void deltaX (int dx) { x += dx ; }
  public void deltaY (int dy) { y += dy ; }
  public int getX () { return x ; } 
  public int getY () { return y ; }
  private int x, y ;  
}
class PointXAdapte extends PointX implements Pixel 
{ public PointXAdapte (PointX px) { super (px.getX(), px.getY() ) ; }
  public void affiche () { super.montre() ; }
  public void deplace (int dx, int dy) { deltaX(dx) ; deltaY(dy) ; }
}
public class Adaptateur2
{ public static void main (String args[])
  {  // code existant utilisant déja des implementations de Pixel
     //   .....
     PointX px = new PointX (3,5) ;
     PointXAdapte pa = new PointXAdapte (px) ;   
     // il peut maintenant utiliser des objets de type PointX, encapsules dans
     // des objets de type PointXAdapte, comme des implementations de Pixel
    pa.affiche ();
    pa.deplace (2, 1) ;
    pa.affiche () ;
  }
}