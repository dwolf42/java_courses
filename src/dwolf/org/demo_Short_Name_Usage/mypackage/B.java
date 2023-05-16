// Class short name usage
package dwolf.org.demo_Short_Name_Usage.mypackage;

public class B {
    C c1 = new C(); // Short name usage
    C c2 = new dwolf.org.demo_Short_Name_Usage.mypackage.C(); // Well, yes, it works, too
    dwolf.org.demo_Short_Name_Usage.mypackage.C c3 = new dwolf.org.demo_Short_Name_Usage.mypackage.C(); // Full name usage
    // non-functional
//    mypackage.C c3 = new dwolf.org.demo_Short_Name_Usage.mypackage.C();
//    A a = new A();
    dwolf.org.demo_Short_Name_Usage.A a1 = new dwolf.org.demo_Short_Name_Usage.A();
}
