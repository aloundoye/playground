   <%-- methode de calcul de factorielle --%>
<%! int fact (int n)
    { int fac = 1 ;
      for (int i=1 ; i<=n ; i++) fac *= i ;
      return fac ;
    }
%>
   <%-- code de determination des valeurs debut et fin --%>
<%
    String sDeb = request.getParameter("debut") ;
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
 <%  for (int i=debut ; i <= fin ; i++)
      {
  %>
        <%= i %>! =  <%= fact(i) %> <br>
 <%   }
  %>
 </body>
</html>
