package OOP.JetBrains.PatientDemo2;

public class PatientDemo {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Heinrich", 40, 182.0f);
        Patient patient2 = new Patient("Mary", 33, 171.5f);
        System.out.println(patient1.age);
        patient1.age = 41;

        System.out.println(patient1.age);
    }
}
