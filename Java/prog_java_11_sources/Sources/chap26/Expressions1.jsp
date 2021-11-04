<html>
 <head>   
  <title> JSP Bonjour </title>
 </head>
 <body>  
 <% String nom = request.getParameter ("prenom") ;
    if (nom == null)
     {
  %>
     BONJOUR
 <%  }
    else
     {
  %>
     BONJOUR <%= nom %>
 <%  }
  %> 
 </body>
</html>
