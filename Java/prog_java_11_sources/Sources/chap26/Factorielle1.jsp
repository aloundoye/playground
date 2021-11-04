   <%-- code de determination des valeurs debut et fin --%>
<%  String sDeb = request.getParameter("debut") ;
    String sFin = request.getParameter("fin") ;
    int debut, fin ;
    if (sDeb == null) debut=1 ;
        else debut = Integer.parseInt (sDeb);
    if (sFin == null) fin=4 ;
        else fin = Integer.parseInt (sFin);
 %>
   
 <%-- construction de la page HTML --%>
<html>
 <head>   
  <title> JSP Calcul de factorielles </title>
 </head>
 <body>  
   Factorielles de <%= debut %> a <%= fin %> <br>
     <% int i = 1, fac = 1 ;
        for ( ; i <= fin ; i++)
          { fac *= i ;
            if (i >= debut)
            {
      %>
        <%= i %>! =  <%= fac %> <br>
     <%     }
          }
      %>
 </body>
</html>
