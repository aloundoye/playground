import java.io.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;
public class BonjourVousCompte extends HttpServlet
{ public void init(ServletConfig Config) throws ServletException
  { compte = 0 ;     // compteur du nombre d’appels de la servlet
  }
  public void doGet (HttpServletRequest req, HttpServletResponse rep)
              throws IOException, ServletException
  { rep.setContentType ("text/html") ;
    PrintWriter page = rep.getWriter() ;
    page.println ("<html>") ;
    page.println ("<head>") ;
    page.println ("<title> Servlet Bonjour comptant ses appels </title>") ;
    page.println ("</head>") ;
    page.println ("<body>") ;   
    String nom = req.getParameter("prenom") ;
    if (nom == null)
     { page.println ("BONJOUR") ;
     }
    else
     { page.println ("BONJOUR " + nom) ;
     }
    compte++ ;
    page.println("Appel numero " + compte) ; 
    page.println ("</body>") ;
  }
  private int compte ;
}
