public class Modulo_Table {
    public static void main(String[] args) {
        horizontalModulo();
        verticalModulo();
    }

    public static void breaksRows() {
        for (int i = 0; i < 101; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static String breaksColumns() {
        return "||";
    }

    public static void horizontalModulo() {
        System.out.println('\n' + "Horizontal");
        breaksRows();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(breaksColumns() + " " + j + "%" + i + " = " + j % i + " ");
            }
            System.out.print(breaksColumns());
            System.out.println();
            breaksRows();
        }
    }

    public static void verticalModulo() {
        System.out.println('\n' + "Vertical");
        breaksRows();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(breaksColumns() + " " + i + "%" + j + " = " + i % j + " ");
            }
            System.out.print(breaksColumns());
            System.out.println();
            breaksRows();
        }
    }
}
/*
At table to see what patterns Modulo is following.
Note:
1. If a / n equals a whole number then a % n always equals 0.
2. If a is less than n then a % n always equals a.
3. If a is greater than n then a % n always equals a value between 1 and n - 1


 */