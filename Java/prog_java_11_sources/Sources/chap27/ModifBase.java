import java.sql.* ;    // pour SQLException, DriverManager, Statement, ResultSet
public class ModifBase         
{ public static void main (String[] args) 
              throws ClassNotFoundException, SQLException 
  {   // recherche et enregistrement du pilote et etablissement connexion
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
    Connection connec = DriverManager.getConnection
                        ("jdbc:derby:C:/Documents and Settings/claude/stocks1");
      // création de l'objet de type Statement associé à la connexion, avec
      // parcours bidirectinnel et résultats actualisables 
    String requete = "SELECT * FROM produits" ;
    Statement stmt = connec.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE) ;
      // exécution de la requête SQL de sélection de données
    ResultSet res ;
    res = stmt.executeQuery(requete);
      // actualisation de la base, via les résultats :
      // on ajoute 10 unités au produit de référence A521
    String refCherchee = "A521" ;  // référence dont on veut modifier la quantité
    while (res.next())
    {  String ref = res.getString(2) ;
       if (ref.equals(refCherchee)) { int ancienneQuantite = res.getInt(4) ;
                                      res.updateInt (4, ancienneQuantite+10) ;
                                      res.updateRow () ;
                                    }
    }   
         // liste de la table modifiée, dans l'ordre inverse
    System.out.println ("--- La table stocks1 après modification") ;
    res.afterLast () ;
    while (res.previous())
    { String nom = res.getString ("nom") ;
      String reference = res.getString ("REFERENCE") ;
      int quantite = res.getInt  ("quantite") ;
      System.out.println (quantite + " " + reference + " " + nom) ;
    }
         // libération des ressources
    stmt.close() ; res.close(); connec.close();
  }  
}
