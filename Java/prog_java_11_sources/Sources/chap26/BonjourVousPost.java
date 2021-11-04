import java.io.* ;
import javax.servlet.* ; 
import javax.servlet.http.* ;

public class BonjourVousPost extends HttpServlet
{ public void doPost (HttpServletRequest req, HttpServletResponse rep)
              throws IOException, ServletException
  { rep.setContentType ("text/html") ;
    PrintWriter page = rep.getWriter() ;
    page.println ("<html>") ;
    page.println ("<head>") ;
    page.println ("<title> Servlet Bonjour </title>") ;
    page.println ("</head>") ;

    String nom = req.getParameter("nom") ;
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
