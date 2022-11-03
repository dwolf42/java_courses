package org.demo.mypackage;

public class B {
    C c1 = new C(); // Short name usage
    C c2 = new org.demo.mypackage.C(); // Well, yes, it works, too
    org.demo.mypackage.C c3 = new org.demo.mypackage.C(); // Full name usage
    // non-functional
//    mypackage.C c3 = new org.demo.mypackage.C();
//    A a = new A();
    org.demo.A a1 = new org.demo.A();
}
