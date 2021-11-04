import java.sql.* ;    // pour SQLException, DriverManager, Statement, ResultSet
public class RequetePrep         
{ public static void main (String[] args) 
              throws ClassNotFoundException, SQLException 
  {   // tableau des références cherchées dans la table produit
    String[] refCherchees = { "E248", "A427", "A432" } ;
      // recherche pilote et étalissement connexion
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
    Connection connec = DriverManager.getConnection
                ("jdbc:derby:C:/Documents and Settings/claude/stocks");
      //  création de l'objet de type PreparedStatement associé à la connexion
      //  contenant une requête préparée à un paramètre
    String requetePrep = "SELECT * FROM produits WHERE REFERENCE = ?" ;
    PreparedStatement prepStmt = connec.prepareStatement(requetePrep) ;
      //   pour chaque référence cherchée, on créée un objet ResultSet  
    ResultSet res ;
    for (int i = 0 ; i< refCherchees.length ; i++)
    { prepStmt.setString (1, refCherchees[i] ) ;	
      res = prepStmt.executeQuery();
      System.out.println ("---- produits de reference : " + refCherchees[i]) ;
      while (res.next()) // pour se placer sur la première ligne si elle existe
      { String nom = res.getString (1) ;
        int qte = res.getInt (4) ;
        System.out.println (nom + " " + refCherchees[i] + " " + qte) ;
      }  
      res.close();
    }   
      // libération des ressources
    prepStmt.close() ;
    connec.close();
  }  
}
