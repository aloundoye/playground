  <%-- creation d'un objet de type PointBean --%>
<jsp:useBean id="point1" class="beans.PointBean" />
  <%-- on initialise les coordonnees avec les valeurs des parametres x et y --%>
<jsp:setProperty name="point1" property="abs" param="x" />
<jsp:setProperty name="point1" property="ord" param="y" />
<html>
 <head>   
  <title> JSP Essai Bean de type PointBean </title>
 </head>
 <body>
  Le point de coordonnees (<jsp:getProperty name="point1" property="abs" /> ,
                           <jsp:getProperty name="point1" property="ord" />) <br>
   a pour norme            <jsp:getProperty name="point1" property="norme" /> <br>
 </body>
</html>
