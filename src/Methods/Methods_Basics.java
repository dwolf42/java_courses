package Methods;

public class Methods_Basics {
    public static void main(String[] args) {
//The entire program lives and ends in the main method. You can branch code outside the main method within a method,
//but in order to be able to run it you have to call this method from within your main method.

    //Calls the method
    //If you would like to pass data to the method "add" you must specify what data the method should process.
    //This is done by declaring the parameters inside the parenthesis by e.g. int a, int b
    add(45, 4);
    add(2, 99);
    add(8, 9);

    }

    public static void add(int a, int b) {

        //Variable c is getting its values from the parameters inside the parenthesis.
        //The parameters getting their values from the arguments passed by "add()" in the main method
        int c = a + b;
        System.out.println(c);

    }

}
