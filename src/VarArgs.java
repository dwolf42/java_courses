import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        printVarArgsString("Hi, I'm Kabraxis", "hello");

        printVarArgsInt(1, 2, 3, 4, 5);
        printVarArgsInt(1, 2, 3);
    }

    public static void printVarArgsString(String... a) {
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }

    public static void printVarArgsInt(int... a) {
        System.out.println(Arrays.toString(a));
    }

    public static void printVarArgsInt(int a, int b) {
    }

}