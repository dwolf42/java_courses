package Methods;

import java.util.Arrays;

public class Methods_Basics {
    public static void main(String[] args) {
/*The entire program lives and ends in the main method. You can branch code outside the main method within a method,
but in order to be able to run it you have to call this method from within your main method.*/

        /*Calls the method
        If you would like to pass data to the method "add" you must specify what data the method should process.
        This is done by declaring the parameters inside the parenthesis by e.g. int a, int b*/
        add(45, 4); /*void method*/
        add(2, 99); /*void method*/

        int result = add(98, 2, 45); /*return value method*/
        System.out.println(result); /*return value method*/
        charArray();
        charPrint();
//    int[][] newArray = toArray(0, 1, 1);
//
//    System.out.println(Arrays.deepToString(newArray));
    }

    public static void add(int a, int b) { /*void method*/

        /*variable c is getting its values from the parameters inside the parenthesis.
        The parameters getting their values from the arguments passed by "add()" in the main method*/
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b, int c) { /*return value method. Also this method is overloading,
    because the parameters are different than these of the other method named add*/
        return a + b;
    }

    public static void charArray() {
        char[] arrayDave = {'D', 'a', 'v', 'e'};
        printIt(arrayDave); /*passes the array charArray to the method printIt()*/
    }

    public static void printIt(char[] receiveArray) { /*<- gets the array from what ever method passes data to it, in this case from charArray();*/
        for (char ch : receiveArray) { /*<- we loop through the received array*/
            System.out.print(ch);
        }
        System.out.print('\n');
    }

    public static char[] characters() {
        char[] waveArray = {'W', 'a', 'v', 'e'};
        return waveArray; /*<-passes the value of the waveArray so any method that uses characters(); is able to receive the array*/
    }

    public static void charPrint() {
        char[] toPrint = characters(); /*<-and here we go, the waveArray from method characters(); is no assigned to the array toPrint*/

        for (char x : toPrint) { /*<-here we loop through the array toPrint who's got its values from method characters();*/
            System.out.print(x);
        }
        System.out.print('\n');
    }
//    public static int[][] toArray(int a, int b, int c) {
//
//        int[][] array = {{ 1, 2, 3, 4, 5 },
//                         { 5, 4, 3, 2, 1 },
//        };
//        return array;
//    };

}
