package beans ;
public class PointBean
{   public PointBean ()
    { abs=0 ; ord=0 ; 
    }
   public int getAbs ()
    { return abs ;
    }
   public int getOrd ()
    { return ord ; 
    }
   public void setAbs (int abs) 
    { this.abs = abs ;
    } 
  public void setOrd (int ord)
    { this.ord = ord ; 
    }
  public double getNorme ()
    { return Math.sqrt (abs*abs + ord*ord) ;
    }
  private int abs, ord ;
}
