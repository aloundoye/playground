    <%-- creation d'un objet de type PrenomBean --%>
<jsp:useBean id="objetPrenom" class="beans.PrenomBean" />
  <%-- on initialise le champ prenom avec la valeur du parametre prenom --%>
<jsp:setProperty name="objetPrenom" property="prenom" param="prenom" />
<html>
 <head>   
  <title> JSP Essai Bean 2 </title>
 </head>
 <body>
     <%-- on affiche la valeur du champ prenom de l'objet objetPrenom --%>
   BONJOUR <jsp:getProperty name="objetPrenom" property="prenom" /> <br>
 </body>
</html>
