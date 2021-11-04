import java.sql.* ;
public class ResMeta1
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
 { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
   Connection connec = DriverManager.getConnection
         ("jdbc:derby:C:/Documents and Settings/claude/stocks");
     // sélection de tous les champs de la table produits de la base stocks  
   String commande = "SELECT * FROM produits" ;
   Statement stmt = connec.createStatement() ;
   ResultSet res ;
   res = stmt.executeQuery(commande);
     // analyse du résultat par création des métadonnées associées
   ResultSetMetaData resMetad = res.getMetaData () ;
   System.out.println
     ("--- Infos champs table PRODUIT : nom, type SQL, numero type SQL, type Java") ;
   int nbChamps = resMetad.getColumnCount() ;
   for (int i = 1 ; i <= nbChamps ; i++)
   { String nom = resMetad.getColumnName(i) ;	  
     String typeSQL = resMetad.getColumnTypeName(i) ; 
     int numTypeSQL = resMetad.getColumnType (i) ;
     String typeJava = resMetad.getColumnClassName(i) ;
     System.out.println (nom + ", " + typeSQL + ", " + numTypeSQL + ", " + typeJava ) ;
   }
  }
}
