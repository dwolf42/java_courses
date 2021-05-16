package Methods;

import java.util.Arrays;

public class Methods_Basics {
    public static void main(String[] args) {
// The entire program lives and ends in the main method. You can branch code outside the main method within a method,
// but in order to be able to run it you have to call this method from within your main method.

        // Calls the method
        // If you would like to pass data to the method "add" you must specify what data the method should process.
        // This is done by declaring the parameters inside the parenthesis by e.g. int a, int b
        add(45, 4); /* void method*/
        add(2, 99); /* void method*/

        int result = add(98, 2, 45); /* return value method*/
        System.out.println(result); /* return value method*/

        // We created the s[] and passed it with the call saySomething(s) to the referring method.
        String[] s = {"hey", "sup"};
        saySomething(s);

    }

    public static void add(int a, int b) { /* void method*/

        // Variable c is getting its values from the parameters inside the parenthesis.
        // The parameters getting their values from the arguments passed by "add()" in the main method
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b, int c) { /* return value method. Also this method is overloading,
    because the parameters are different than these of the other method named add*/
        return a + b;
    }

    // The method receives the array as argument in the parenthesis and the print prints it by using the argument.
    public static void saySomething(String[] s){
        System.out.println(s[1]);
    }

}
