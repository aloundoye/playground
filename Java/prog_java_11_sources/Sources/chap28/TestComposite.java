import java.util.* ;         // pour ArrayList
abstract class Composant
{ public void ajoute (Composant c) {}
  public abstract void affiche () ;  // a redefinir dans chaque classe concrete
  public Composant (String nom) {this.nom = nom ; }
  public String getNom () { return nom ; }
  private String nom ;
}
class Cercle extends Composant
{ public Cercle (String nom) { super(nom) ; }
  public void affiche () { System.out.println ("Cercle " + getNom() ) ; }
}
class Rectangle extends Composant
{ public Rectangle (String nom) { super(nom) ; }
  public void affiche () { System.out.println ("Rectangle " + getNom() ) ; }
}
class Groupe extends Composant
{ public Groupe (String nom) { super(nom) ; }
  public void ajoute (Composant c) { listeComposants.add (c) ; }
  public void affiche ()
  { System.out.println ("---- Groupe " + getNom() + " contenant : ") ;
    for (Composant c : listeComposants) { c.affiche() ; }  // depuis JDK5
    System.out.println ("-------- fin groupe " + getNom()) ;
  }
  private ArrayList<Composant> listeComposants = new ArrayList <Composant> ();	
}
public class TestComposite
{ public static void main (String args[])
  { Cercle c1 = new Cercle ("C1") ; Cercle c2 = new Cercle ("C2") ;
    Rectangle r1 = new Rectangle ("R1") ;
    c1.affiche () ;
    Groupe ga = new Groupe ("GA") ; ga.ajoute(c1) ; ga.ajoute(r1) ; ga.affiche () ;
    Groupe gb = new Groupe ("GB") ; gb.ajoute(ga) ; gb.ajoute(c2) ; gb.affiche () ;
  }
}
