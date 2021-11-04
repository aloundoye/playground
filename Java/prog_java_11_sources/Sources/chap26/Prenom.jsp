<html>
 <head>   
  <title> JSP Bonjour avec une classe Prenom </title>
 </head>
 <body>  
 <% Prenom pr ;               // declaration d’un objet local du type classe Prenom
    String s = request.getParameter ("prenom") ; // recuperation parametre prenom
    if (nom != null) pr.setPrenom (s) ;         
  %>
    BONJOUR <%= pr.getPrenom() %>
 </body>
</html>
