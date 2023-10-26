package dwolf.interfaces;

interface Car {
    static float convertToMilesPerHour(float kmh) {
        return (float) (0.62 * kmh);
    }
}
