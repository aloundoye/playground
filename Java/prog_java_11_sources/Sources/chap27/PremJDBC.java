import java.sql.* ;    // pour SQLException, DriverManager, Statement, ResultSet
public class PremJDBC         
{ public static void main (String[] args) 
      throws ClassNotFoundException, SQLException  // on ne traite pas les exceptions
  {   // recherche et enregistrement du pilote (driver)
     Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
      // établissement de la connexion avec la base stocks (créée ici avec Derby)
     Connection connec = DriverManager.getConnection
                        ("jdbc:derby:C:/Documents and Settings/claude/stocks");
      // création de l'objet de type Statement associé à la connexion, contenant 
      //   une requête SQL (ici de sélection de données)
    String requete = "SELECT nom, quantite FROM produits" ;
    Statement stmt = connec.createStatement() ;
      // exécution de la requête SQL de sélection de données
    ResultSet res ;
    res = stmt.executeQuery(requete);
      // récupération et affichage des résultats de la sélection
    String nom ;
    int quantite ;
    while (res.next())
    {  nom = res.getString(1) ;        // première colonne du résultat
         quantite = res.getInt (2) ;     // deuxième colonne du résultat
       System.out.println (quantite + " " + nom) ;
    }
      // libération des ressources
    stmt.close() ;
    res.close();
    connec.close();
  }  
}
