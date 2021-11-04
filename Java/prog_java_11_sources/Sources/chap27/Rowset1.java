import java.sql.* ;
import javax.sql.rowset.* ;   // pour rowset
import com.sun.rowset.JdbcRowSetImpl ;  // indispensable !!!  
public class Rowset1
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
  { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ; 
    JdbcRowSet rs = new JdbcRowSetImpl () ;
    rs.setUrl ("jdbc:derby:C:/Documents and Settings/claude/stocks");
    rs.setType (ResultSet.TYPE_SCROLL_SENSITIVE) ;
    rs.setConcurrency (ResultSet.CONCUR_UPDATABLE) ;  
    rs.setCommand ("SELECT nom, quantite FROM produits") ;
    rs.execute();
      // petite mise à jour
    rs.first() ;
    rs.updateString (1, "Cafetière 9 T") ;
    rs.updateRow();
      // liste dans l'ordre inverse
    String nom ; int qte ;
    rs.afterLast();
    while (rs.previous())
    { nom  = rs.getString (1) ; qte  = rs.getInt (2) ;
      System.out.println (nom + " " + qte) ;
    }
    rs.close ();
  }
}
