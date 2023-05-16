// Class short name usage
package dwolf.demo_Short_Name_Usage.mypackage;

public class B {
    C c1 = new C(); // Short name usage
    C c2 = new dwolf.demo_Short_Name_Usage.mypackage.C(); // Well, yes, it works, too
    dwolf.demo_Short_Name_Usage.mypackage.C c3 = new dwolf.demo_Short_Name_Usage.mypackage.C(); // Full name usage
    // non-functional
//    mypackage.C c3 = new dwolf.demo_Short_Name_Usage.mypackage.C();
//    A a = new A();
    dwolf.demo_Short_Name_Usage.A a1 = new dwolf.demo_Short_Name_Usage.A();
}
