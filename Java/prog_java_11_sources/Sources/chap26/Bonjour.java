import java.io.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

public class Bonjour extends HttpServlet
{ public void doGet (HttpServletRequest req, HttpServletResponse rep)
              throws IOException, ServletException
  { rep.setContentType ("text/html") ;
    PrintWriter page = rep.getWriter() ;
    page.println ("<html>") ;
    page.println ("<head>") ;
    page.println ("<title> Servlet Bonjour </title>") ;
    page.println ("</head>") ;
    page.println ("<body>") ;
       page.println ("<font size=+2>") ;
       page.println ("BONJOUR") ;
       page.println ("</body>") ;
    }
}
