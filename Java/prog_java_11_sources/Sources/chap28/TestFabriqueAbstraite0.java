abstract class BoutonRadio
{ public abstract String type () ; }
class BoutonRadioA extends BoutonRadio
{  public String type () { return "Bouton radio Style A" ; } 
}
class BoutonRadioB extends BoutonRadio
{ public String type () { return "Bouton radio style B" ; } 
}
abstract class CaseCocher 
{ public abstract String identification () ; 
}
class CaseCocherA extends CaseCocher
{ public String identification () { return "Case a cocher style A" ; } 
}
class CaseCocherB extends CaseCocher
{ public String identification () { return "Case a cocher style B" ; } 
}
abstract class FabriqueAbstraite
{ abstract BoutonRadio creerBoutonRadio () ;
  abstract CaseCocher creerCaseCocher () ;
}
class FabriqueStyleA extends FabriqueAbstraite 
{ public BoutonRadio creerBoutonRadio () { return new BoutonRadioA ()  ; }
  public CaseCocher creerCaseCocher ()   { return new CaseCocherA () ; }
}
class FabriqueStyleB extends FabriqueAbstraite
{ public BoutonRadio creerBoutonRadio () { return new BoutonRadioB () ; }
  public CaseCocher creerCaseCocher ()   { return new CaseCocherB () ; }
}
public class TestFabriqueAbstraite0
{ public static void main (String args[])
  { BoutonRadio br1, br2 ;
    CaseCocher cc ;
    FabriqueAbstraite f  = new FabriqueStyleA() ; // choix de la fabrique
    br1 = f.creerBoutonRadio () ; System.out.println (br1.type () ) ;
    cc  = f.creerCaseCocher ()  ; System.out.println (cc.identification () ) ;
    br2 = f.creerBoutonRadio () ; System.out.println (br2.type () ) ;
  }
}
