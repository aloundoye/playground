public class Applet
{ public static void main (String args[])
  { String applet = """
    <HTML>
      <BODY>
       <APPLET
          CODE = "App2Bout.class"
          WIDTH    = 250
          HEIGHT   = 100
       >
       </APPLET>
     </BODY>
    </HTML>""" ;
   System.out.println (applet) ;
  }
}
