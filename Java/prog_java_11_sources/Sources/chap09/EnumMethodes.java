public class EnumMethodes
{ public static void main (String args[])
  { System.out.println ("Noms des valeurs du type jour et leurs abreviations") ;
    for (Jour j : Jour.values() )
       System.out.println ( j + " : " + j.abreviation() ) ;
  }
}
enum Jour
{ lundi ("lu"), mardi ("ma"), mercredi ("me"), jeudi ("je"), vendredi ("ve"),
                samdei ("sa"), dimanche ("di") ;
  private Jour (String a)    // constructeur ; en argument, l'abreviation
  { abrege = a ;
  }
  public String abreviation () { return abrege ; }
  private String abrege ;
}
/*
Noms des valeurs du type jour et leurs abreviations
lundi : lu
mardi : ma
mercredi : me
jeudi : je
vendredi : ve
samdei : sa
dimanche : di
*/
