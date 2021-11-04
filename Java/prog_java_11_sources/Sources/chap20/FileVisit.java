import java.io.* ;
import java.nio.* ;
import java.nio.file.* ;
import java.nio.file.attribute.* ;
import static java.nio.file.FileVisitResult.* ;
public class FileVisit
{ public static void main (String[] args) throws IOException
  { Path p = Paths.get("D:\\donnees") ;
    AffichRepert ar = new AffichRepert() ;
    Files.walkFileTree (p, ar) ;
  }
  public static class AffichRepert extends SimpleFileVisitor<Path>
  { public FileVisitResult visitFile (Path fich, BasicFileAttributes attr)
    { // on entre ici a chaque fichier visite
	    if (attr.isRegularFile()) System.out.println (fich.getFileName()) ;
	    return CONTINUE ;
    }
  }
}
