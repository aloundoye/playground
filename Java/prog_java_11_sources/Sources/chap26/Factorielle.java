import java.io.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

public class Factorielle extends HttpServlet
{ public void doGet (HttpServletRequest req, HttpServletResponse rep)
              throws IOException, ServletException
  { rep.setContentType ("text/html") ;
    PrintWriter page = rep.getWriter() ;
    page.println ("<html>") ;
    page.println ("<head>") ;
    page.println ("<title> Servlet Calcul de Factorielle </title>") ;
    page.println ("</head>") ;

    String sDeb = req.getParameter("debut") ;
    String sFin = req.getParameter("fin") ;
    int debut, fin ;
    if (sDeb == null) debut=0 ;
        else debut = Integer.parseInt (sDeb);
    if (sFin == null) fin=0 ;
        else fin = Integer.parseInt (sFin);

     page.println ("<body>") ;
     page.println ("factorielles de " + debut + " a " + fin + "<br>") ;
     int i = 1,  fac = 1 ;
     for ( ; i <= fin ; i++)
      { fac *= i ;
        if (i >= debut) page.println(i + "! = " + fac +"<br>");
      }
       page.println ("</body>") ;
  }
}
