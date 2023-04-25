package dwolf.oop.my_work.static_keyword.methods_and_members;

public class StaticMethodsAndMembers {
    public static int num = 20;
    public int num2 = 30;

    public StaticMethodsAndMembers() {
        invokeAnInstanceMethod();
        invokeAStaticMethod();
    }

    public void invokeAnInstanceMethod() {
        num = 10;
        num2 = 2;
        invokeAStaticMethod();
    }

    public static void invokeAStaticMethod() {
        num = 15;
//        num2 = 12;

        StaticMethodsAndMembers lol = new StaticMethodsAndMembers();
        lol.invokeAnInstanceMethod();
//        this.num2 = 1;
//        invokeAnInstanceMethod();
    }
}
