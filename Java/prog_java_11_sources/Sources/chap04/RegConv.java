public class RegConv
{ public static void main (String args[])
  {  float x ; double y ; int n ; short p ;
     y = 1e-300 ;
     x = (float) y ; System.out.println ("double-float : " + y + " --> " + x) ;
     y = -1e-300 ;
     x = (float) y ; System.out.println ("double-float : " + y + " --> " + x) ;
     y = 1e+300 ;
     x = (float) y ; System.out.println ("double-float : " + y + " --> " + x) ;
     x = 123456789.f ;
     n = (int) x ;   System.out.println ("float-int    : " + x + " --> " + n) ;
     p = (short) x ; System.out.println ("float-short  : " + x + " --> " + p) ;
     x = 1.23456789e15f ;
     n = (int) x ;   System.out.println ("float-int    : " + x + " --> " + n) ;
     p = (short) x ; System.out.println ("float-short  : " + x + " --> " + p) ;
     x = 32771.f ;
     n = (int) x ;   System.out.println ("float-int    : " + x + " --> " + n) ;
     p = (short) x ; System.out.println ("float-short  : " + x + " --> " + p) ;
  }
}

