import javax.swing.* ;
public class Infos extends JApplet
{ public void init ()
  { String nomMois = getParameter ("mois") ;
    String nomAnnee = getParameter ("annee") ;
    int annee, anneeSuiv ;
    System.out.println ("Mois = " + nomMois) ;
    System.out.println ("Annee = " + nomAnnee) ;
    annee = Integer.parseInt(nomAnnee) ;
    anneeSuiv = annee+1 ;
    System.out.println ("Annee suivante = " + anneeSuiv) ;
  }
}

