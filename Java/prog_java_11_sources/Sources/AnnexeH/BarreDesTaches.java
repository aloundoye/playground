import java.awt.* ;
import javax.swing.* ;
import java.io.* ;
public class BarreDesTaches 
{  public static void main (String args[]) throws AWTException, IOException
   { if (SystemTray.isSupported()) System.out.println ("SystemTray OK");
                            else { System.out.println ("SystemTray pas supporte");
                                   System.exit(-1);
                                 } 
   ImageIcon im1 = new ImageIcon ("rouge.gif") ;   
   Image image1 = im1.getImage();
   TrayIcon tic1 = new TrayIcon (image1, "PourInfo_Bulle_Icone_Rouge") ;
   SystemTray tray = SystemTray.getSystemTray();
   tray.add(tic1) ;
   Clavier.lireString () ;   // pour provoquer une attente utilisateur
   ImageIcon im2 = new ImageIcon ("vert.gif") ; 
   Image image2 = im2.getImage();
   TrayIcon tic2 = new TrayIcon (image2, "PourInfo_Bulle_Icone_Verte") ;
   tray.add(tic2) ;
   Clavier.lireString () ;    // nouvelle attente
   tray.remove(tic1) ;  // suppression première icône
   Clavier.lireString () ;    // dernière attente              
   }
}
