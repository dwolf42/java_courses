package dwolf.school.pruefNummer;

public class Kartennummer {
    public static void main(String[] args) {
        int[] kartennummer = {5, 1, 2, 4, 8, 9, 7, 2, 5};
        pruefeNummer(kartennummer);
    }

    public static boolean pruefeNummer(int[] kartennummer) {
        int summe = 0;
        for (int i = 0; i < kartennummer.length - 1; i++) {
            summe += kartennummer[i] * (i + 1);
        }
        int pruefziffer = summe % kartennummer[9];
//
//        if (pruefziffer == kartennummer[9]) {
//            return true;
//        }
        return false;
    }
}
