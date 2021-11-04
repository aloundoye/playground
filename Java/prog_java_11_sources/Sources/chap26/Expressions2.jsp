<html>
 <head>   
  <title> JSP Bonjour </title>
 </head>
 
<body>  
 <% String nom = request.getParameter ("prenom") ;
    if (nom == null) nom = "" ;   // si pas de paramètre, on crée une chaine vide
 %>
    BONJOUR <%= nom %>
 </body>
</html>
