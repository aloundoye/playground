<html>
 <head>   
  <title> JSP Bonjour </title>
 </head>
 
<body>  
 <% String nom = request.getParameter ("prenom") ;
    if (nom == null) nom = "" ;   // si pas de param�tre, on cr�e une chaine vide
 %>
    BONJOUR <%= nom %>
 </body>
</html>
