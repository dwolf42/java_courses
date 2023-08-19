package dwolf.enums.fields_methods;

public class FieldsMethods {
    public static void main(String[] args) {
        System.out.println(ChargeLevel.LOW.getSections());
        System.out.println(ChargeLevel.HIGH.getSections());
        System.out.println(ChargeLevel.findChargeLevelByNumberOfSections(4));
        System.out.println(ChargeLevel.findChargeLevelByColor("red"));
        System.out.println(ChargeLevel.valueOf("FULL"));
    }

}
