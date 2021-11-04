import java.sql.* ;    // pour SQLException, DriverManager, Statement, ResultSet
public class CopyProd         
{ public static void main (String[] args)  throws ClassNotFoundException, SQLException 
  {     // recherche et enregistrement pilote
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
        // établissement de la connexion avec les bases stocks et stocksA
    Connection connec = DriverManager.getConnection
                        ("jdbc:derby:C:/Documents and Settings/claude/stocks");
    Connection connecA = DriverManager.getConnection
                        ("jdbc:derby:C:/Documents and Settings/claude/stocksA");
        // sélection données table produits de la base stocks
    String requete = "SELECT * FROM produits" ;
    Statement stmt = connec.createStatement() ; 
                             // ici, pas besion de parcours, ni d'actualisation
    ResultSet res ;
    res = stmt.executeQuery(requete);
        // création table produits base stocksA
    String requeteA = "CREATE TABLE produits "
                         + "( nom VARCHAR (32), reference VARCHAR (32),"
                         + " prix DOUBLE, quantite INTEGER," 
                         + " fournisseur VARCHAR (8) )" ;
    Statement stmtA = connecA.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE,
                                               ResultSet.CONCUR_UPDATABLE) ;  
    stmtA.execute(requeteA) ;
        // création d'un objet ResultSet acutalisable 
        //         pour la table produits (vide) de la base stocksA    
    String requeteA1 = "SELECT * FROM produits" ;
    ResultSet resA = stmtA.executeQuery (requeteA1) ;
        // copie produits de stocks dans produits de stocksA
    while (res.next())
    { String nom = res.getString(1) ; String ref = res.getString(2) ;
      int prix = res.getInt(3) ;      int qte = res.getInt(4) ;
      String fourn = res.getString (5) ;
      double prixA = prix/100. ;   // car prix base stock exprmié en cents
      resA.moveToInsertRow () ;
      resA.updateString(1, nom) ;  resA.updateString(2, ref) ;
      resA.updateDouble (3, prixA) ; resA.updateInt(4, qte) ;
      resA.updateString(5, fourn) ;
      resA.insertRow () ;
    }  
        // libération des ressources
    stmt.close () ; stmtA.close () ; 
    res.close ();
    connec.close () ; connecA.close ();
  }  
}
