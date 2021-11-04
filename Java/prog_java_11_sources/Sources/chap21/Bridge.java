public class Bridge
{ public static void main (String args[])
  { A<Double> ad = new A<Double> () ;
    A<Integer> ai = new A<Integer> () ;
    B b = new B() ;
    Double d = new Double (2.5) ; Integer i = new Integer (2) ;
    ad.f(d) ;
    ai.f(i) ;
    b.f(i) ;
    ai = b ;
    ai.f(i) ;
  }
}
class A<T>
{ void f (T x) { System.out.println ("appel A.f") ; }
}
class B extends A<Integer>
{ void f(Integer i) { System.out.println ("appel B.f") ; }
}
/*
appel A.f
appel A.f
appel B.f
appel B.f
*/
