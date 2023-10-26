package dwolf.hide_override_overload_methods;

public class HidingStaticMethods {
    public static void main(String[] args) {

        // Hiding static methods
        SuperClass.staticMethod();          // super
        SubClass.staticMethod();            // sub

        SuperClass sus = new SubClass();
        sus.staticMethod();                  // super, because static method belongs to a class, not to an instance

    }

}
// If a subclass has a static method with the same signature as a static method in the superclass
// then the method in the subclass hides the one in the superclass.
class SuperClass {
    public static void staticMethod() {
        System.out.println("super");
    }
}

class SubClass extends SuperClass {
    public static void staticMethod() {
        System.out.println("sub");
    }
}
