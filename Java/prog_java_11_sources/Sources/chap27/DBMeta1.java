import java.sql.* ;
public class DBMeta1    
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
 { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ;
   Connection connec = DriverManager.getConnection
         ("jdbc:derby:C:/Documents and Settings/claude/stocks");
   DatabaseMetaData metad = connec.getMetaData() ;
   System.out.println ("---- Défilement et actualisation :") ;
   if (metad.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY))
       System.out.println ("TYPE_FORWARD_ONLY") ;    
   if (metad.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE))
        System.out.println ("TYPE_SCROLL_INSENSITIVE") ; ;
   if (metad.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE))
        System.out.println ("TYPE_SCROLL_SENSITIVE") ;
   String pilote = metad.getDriverName() ;
   String versionPilote = metad.getDriverVersion() ;  
   System.out.println ("--- Nom du pilote = " + pilote + " version " + versionPilote) ;
   String sgdbr = metad.getDatabaseProductName() ;
   String versionSgdbr = metad.getDatabaseProductVersion() ;
   System.out.println ("--- Nom du SGDBR = " + sgdbr + " version " + versionSgdbr) ;
   String motsSQL = metad.getSQLKeywords() ;
   System.out.println ("--- Mots cles SQL = " + motsSQL) ;
   ResultSet typesSQL = metad.getTypeInfo() ;
   System.out.println ("--- Types SQL") ;
   while (typesSQL.next())
   { String type = typesSQL.getString(1) ;   // ou getString ("TYPE_NAME") 
     System.out.print (type + ", " ) ; 
   }
   System.out.println () ;
 }
}
