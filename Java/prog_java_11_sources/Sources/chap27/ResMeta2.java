import java.sql.* ;
public class ResMeta2
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
  { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
    Connection connec = DriverManager.getConnection
          ("jdbc:derby:C:/Documents and Settings/claude/stocksC");
      // sélection de tous les champs d’une jointure entre
    String commande = "SELECT * FROM produit INNER JOIN fournisseurs "
                    + "ON produits.fournisseur = fournisseurs.reference" ;
    Statement stmt = connec.createStatement() ;
    ResultSet res ;
    res = stmt.executeQuery(commande);
      // analyse du résultat par création des métadonnées associées
    ResultSetMetaData resMetad = res.getMetaData () ;
    System.out.println ("--- Infos champs sélection:") ;
    System.out.println ("--- nom, type SQL, numéro type SQL, type Java, table") ;
    int nbChamps = resMetad.getColumnCount() ;
    for (int i = 1 ; i <= nbChamps ; i++)
    { String nom = resMetad.getColumnName(i) ;	  
      String typeSQL = resMetad.getColumnTypeName(i) ; 
      int numTypeSQL = resMetad.getColumnType (i) ;
      String typeJava = resMetad.getColumnClassName(i) ;
      String table = resMetad.getTableName(i);
      System.out.println (nom + ", " + typeSQL + ", " + numTypeSQL + ", " + typeJava 
                          + ", " + table) ;
    }
  }
}
