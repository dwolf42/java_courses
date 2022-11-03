package org.demo.mypackage;

public class B {
    C c1 = new C();
    C c2 = new org.demo.mypackage.C();
    // non-functional
//    mypackage.C c3 = new org.demo.mypackage.C();
//    A a = new A();
    org.demo.A a1 = new org.demo.A();
}
