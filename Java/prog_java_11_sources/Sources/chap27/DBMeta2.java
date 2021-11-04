import java.sql.* ;
public class DBMeta2    
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
  { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
    Connection connec = DriverManager.getConnection
          ("jdbc:derby:C:/Documents and Settings/claude/stocks");
    DatabaseMetaData metad = connec.getMetaData() ;
  
    String[] Infos = { "TABLE" } ;   // pour le quatrième argument de getTables
    ResultSet tables = metad.getTables(null, null, null, Infos) ;
    while (tables.next())
    { String nomTable = tables.getString("TABLE_NAME") ;  // ou : getString (3)
      ResultSet champsTable = metad.getColumns(null, null, nomTable, null) ;
      System.out.println ("Noms, numéro type SQL et type SQL des champs de la table "
                          + nomTable) ;
      while (champsTable.next())
      { String nomCol = champsTable.getString ("COLUMN_NAME") ;   // ou getString (4) 
        String numTypeSQL = champsTable.getString ("DATA_TYPE") ; // ou getString (5) 
        String typeSQL = champsTable.getString ("TYPE_NAME") ;    // ou getString (6)
        System.out.println (nomCol + ", " + numTypeSQL + ", " + typeSQL) ;
      }
    }
  }
}
