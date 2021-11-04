interface Pixel
{ void affiche () ;
  void deplace (int dx, int dy) ;
}
class PointX  
{ public PointX (int x, int y) { this.x =  x ; this.y = y ; }
  public void montre() { System.out.println ("Coordonnees = " + x + " " + y) ; }
  public void deltaX (int dx) { x += dx ; }
  public void deltaY (int dy) { y += dy ; }
  private int x, y ;
}
class PointXAdapte implements Pixel // on pourrait aussi extends Pixel si classe
{ private PointX px ; 
  public PointXAdapte (PointX px) { this.px = px ; } 
  public void affiche () { px.montre() ; }
  public void deplace (int dx, int dy) { px.deltaX(dx) ; px.deltaY(dy) ; }
}
public class Adaptateur1
{ public static void main (String args[])
  { // code existant utilisant déja des implementations de Pixel
    //   .....
    PointX pxa = new PointX (2, 5) ;
    PointXAdapte pa = new PointXAdapte (pxa) ;
    // il peut maintenant utiliser des objets de type PointX, encapsules
    // dans des objets de type PointXAdapte, comme des implementations de Pixel :
    pa.affiche ();
    pa.deplace (2, 1) ;
    pa.affiche () ;
  }
}