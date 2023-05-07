package dwolf.print_formatted;

public class FormattedOutput {
    public static void main(String[] args) {
        demoPrintF();
        demoStringFormat();
        demoStringFormatted();
    }

    public static void demoPrintF() {
        String name = "Kabraxis";
        int year = 1900;
        System.out.printf("My name is %s. I was born in %d%n%n", name, year);
    }

    public static void demoStringFormat() {
        int age = 25;
        char initial = 'K';
        String surname = "Luvos";
        double height = 1.85;

        String details = String.format(
                "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.%n%n",
                initial, surname, age, height);
        System.out.println(details);
    }

    public static void demoStringFormatted() {
        int age = 23;
        char initial = 'E';
        String surname = "Luvos";
        double hight = 1.75;

        String details = "My name is %c. %s.%nMy age is %d.%nMy height is %.2f."
                .formatted(initial, surname, age, hight);

        System.out.println(details);
    }
}
