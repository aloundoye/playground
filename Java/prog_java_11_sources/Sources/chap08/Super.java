class A
{ void f()
  { System.out.println ("appel f de A") ;
  }
}
class B extends A
{ void f()
  { System.out.println ("appel f de B") ;
  }
  public void test()
  { A a = super ;
    a.f() ;
    super.f() ;
    this.f() ;
  }
}
public class Super
{ public static void main (String args[])
  { B b = new B() ;
    b.test() ;
  }
}

