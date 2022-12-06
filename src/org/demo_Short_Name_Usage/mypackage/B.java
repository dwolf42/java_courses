// Class short name usage
package org.demo_Short_Name_Usage.mypackage;

public class B {
    C c1 = new C(); // Short name usage
    C c2 = new org.demo_Short_Name_Usage.mypackage.C(); // Well, yes, it works, too
    org.demo_Short_Name_Usage.mypackage.C c3 = new org.demo_Short_Name_Usage.mypackage.C(); // Full name usage
    // non-functional
//    mypackage.C c3 = new org.demo_Short_Name_Usage.mypackage.C();
//    A a = new A();
    org.demo_Short_Name_Usage.A a1 = new org.demo_Short_Name_Usage.A();
}
