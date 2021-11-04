class A
{ public int n= 4 ;
}
class B extends A
{ public float n = 4.5f ;
}
public class DupChamp
{ public static void main(String[]args)
  { A a = new A() ; B b = new B() ;
    System.out.println ("a.n = " + a.n) ;
    System.out.println ("b.n = " + b.n) ;
  }
}




