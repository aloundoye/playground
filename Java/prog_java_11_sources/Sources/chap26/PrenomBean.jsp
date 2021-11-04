   <%-- creation d'un objet de type PrenomBean --%>
<jsp:useBean id="objetPrenom" class="beans.PrenomBean" />
 <head>   
  <title> JSP Essai Bean </title>
 </head>
 <body>
   <jsp:setProperty name="objetPrenom" property="prenom" value="Thibault" />
   BONJOUR <jsp:getProperty name="objetPrenom" property="prenom" /> <br>
 </body>
</html>
