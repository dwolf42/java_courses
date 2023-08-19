package dwolf.enums.fields_methods;

public enum ChargeLevel {
    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    private final int sections;
    private final String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public static ChargeLevel findChargeLevelByNumberOfSections(int sections) {
        for (ChargeLevel value : values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }

    public static String findChargeLevelByColor(String color) {
        for (ChargeLevel value : values()) {
            if (value.color.equals(color)) {
                return value.name();
            }
        }
        return null;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }
}
