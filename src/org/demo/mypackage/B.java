package org.demo.mypackage;

public class B {
    C c1 = new C();
    C c2 = new org.demo.mypackage.C();
    // non-functional
//    mypackage.C c3 = new org.demo.mypackage.C();
    org.demo.A a = new org.demo.A();
    // non-functional
//    A a1 = new A();
}
