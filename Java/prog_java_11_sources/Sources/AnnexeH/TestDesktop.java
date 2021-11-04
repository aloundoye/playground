import java.awt.* ;   // pour Desktop
import java.io.* ;    // pour IOException
import java.net.*;    // pour URI 
public class testDesktop 
{  public static void main (String[] args)throws URISyntaxException, IOException
  {  if (Desktop.isDesktopSupported())System.out.println ("Desktop supporte");
                                else { System.out.println ("Desktop non supporte") ;
                                       System.exit(-1) ;
                                     }
         // définitions des différentes informations à compléter :
         //   url, adresse mail, nom fichier (xxxxxx) et type (ttt), message
      URI adresseWeb = new URI("http://www..........") ; 
      File fichier = new File ("xxxxxx.ttt") ;    
      String message = "salut" ;
      URI uriMail= new URI (".........", message, null) ;   
      
      Desktop bureau = Desktop.getDesktop() ;
      if (bureau.isSupported(Desktop.Action.BROWSE))
      { System.out.println ("BROWSE accepte") ;
        bureau.browse(adresseWeb) ;  // peut déclencher une IOException
        System.in.read();            // pour créer une attente
      }
      if (bureau.isSupported(Desktop.Action.MAIL))
      { System.out.println ("MAIL accepte") ;
        bureau.mail (uriMail) ;
        System.in.read();            // pour créer une attente
      }
      if (bureau.isSupported(Desktop.Action.OPEN))
      { System.out.println ("OPEN accepte") ;
        bureau.open(fichier) ;
        System.in.read();            // pour créer une attente
      }
      if (bureau.isSupported(Desktop.Action.PRINT))
      { System.out.println ("PRINT accepte") ;
        bureau.print(fichier) ;
        System.in.read();            // pour créer une attente
      }
  }
}
