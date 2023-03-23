// Inheritance

package kabraxis.oop.my_work.inheritance.company;

import java.util.Date;

public class Testimonial {
    public static void main(String[] args) {

        Programmer p = new Programmer();

        p.setName("Gruxa Xagfera");
        p.setYearOfBirth(1985);
        p.setAddress("Beneath Totura");
        p.setStartDate(new Date(21031996));
        p.setSalary(500_000L);

        p.setProgrammingLanguages(new String[]{"Java", "Dart", "C++"});


        System.out.printf("Please welcome our newest staff member %s from the beautiful village %s.%n" +
                        "She was born in %d and entered our company on " + p.getStartDate() + "%n" +
                        "Her skill set is %s",
                p.getName(), p.getAddress(), p.getYearOfBirth(), String.join(", ", p.getProgrammingLanguages()));

    }

    public static void firstMethod(int aNumber) {
        if (aNumber > 5) {
            return;
        }

        secondMethod(aNumber);
    }

    public static void secondMethod(int aNumber) {
        if (aNumber < 10) {
            return;
        }

        thirdMethod(aNumber);
    }


    public static void thirdMethod(int aNumber) {
        aNumber = -1;
        firstMethod(aNumber);
    }


}