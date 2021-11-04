<html>
 <head>   
  <title> JSP Bonjour </title>
 </head>
 <body>  
 <%
   String nom = request.getParameter ("prenom") ;
   if (nom == null)                          
    {
      out.println ("BONJOUR") ;              
    }
   else
    {
     out.println ("BONJOUR " + nom) ;
    }
 %> 
 </body>
</html>
