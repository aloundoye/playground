import java.sql.* ;
import com.sun.rowset.CachedRowSetImpl ;   // ou sun.rowset.CachedRowSetImpl
import javax.sql.rowset.* ;   // pour CachedRowSet
public class Rowset2
{ public static void main (String[] args) throws ClassNotFoundException, SQLException
  { Class.forName ("org.apache.derby.jdbc.EmbeddedDriver") ; 
    CachedRowSet rs = new CachedRowSetImpl () ;
    rs.setUrl ("jdbc:derby:C:/Documents and Settings/claude/stocks");
    rs.setType (ResultSet.TYPE_SCROLL_SENSITIVE) ;
    rs.setConcurrency (ResultSet.CONCUR_UPDATABLE) ;  
    rs.setCommand ("SELECT nom, quantite FROM produits") ;
    rs.execute();
      // petite mise à jour du premier enregistrement
    rs.first() ;
    rs.updateString (1, "Cafetière 15 T") ;
    rs.updateRow(); 
    rs.acceptChanges() ; // indispensable ici
      // liste dans l'ordre inverse
    String nom ; int qte ;
    rs.afterLast ();
    while (rs.previous())
    { nom  = rs.getString (1) ; qte  = rs.getInt (2) ;
      System.out.println (nom + " " + qte) ;
    }
    rs.close();
  } 
}
