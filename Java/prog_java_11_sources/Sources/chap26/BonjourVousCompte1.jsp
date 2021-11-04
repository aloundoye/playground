<html>
 <head>   
  <title> JSP Bonjour comptant ses appels </title>
 </head>
 <body>  
 <%! int compte=0 ; %>
 <% String nom = request.getParameter ("prenom") ;
    if (nom == null)
     {  out.println ("BONJOUR") ;
     }
    else
     { out.println ("BONJOUR " + nom) ;
     }
    compte++ ;
    out.println ("numero : " + compte) ;
 %> 
 </body>
</html>
