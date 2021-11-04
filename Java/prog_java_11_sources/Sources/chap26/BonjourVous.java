import java.io.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

public class BonjourVous extends HttpServlet
{ public void doGet (HttpServletRequest req, HttpServletResponse rep)
              throws IOException, ServletException
  { rep.setContentType ("text/html") ;
    PrintWriter page = rep.getWriter() ;
    page.println ("<html>") ;
    page.println ("<head>") ;
    page.println ("<title> Servlet Bonjour </title>") ;
    page.println ("</head>") ;
  
  String nom = req.getParameter("prenom") ;
    if (nom == null)
     { page.println ("<body>") ;
       page.println ("BONJOUR") ;
       page.println ("</body>") ;
     }
    else
     { page.println ("<body>") ;
       page.println ("<font size=+2>") ;
       page.println ("BONJOUR " + nom) ;
       page.println ("</body>") ;
     }
  }
}
