<%-- code Java de détermination du prenom et de comptage des appels --%>
<%!   int compte=0 ;             // nombre d’appels %>
<%    String nom = request.getParameter ("prenom") ;
       if (nom == null) nom = "" ;     
       compte++ ;
 %>

<%-- construction de la page HTML --%> 
<html>
 <head>   
  <title> JSP Bonjour comptant ses appels </title>
 </head>
 <body>  
   BONJOUR <%= nom %>
   <BR> <BR>
   APPEL numero : <%= compte %>
 </body>
</html>
