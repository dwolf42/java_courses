package kabraxis.oop.jet_brains.constructors.patient_demo2;

public class PatientDemo2 {
    public static void main(String[] args) {
        Patient2 patient1 = new Patient2("Heinrich", 40, 182.0f);
        Patient2 patient2 = new Patient2("Mary", 33, 171.5f);
        System.out.println(patient1.age);
        patient1.age = 41;

        System.out.println(patient1.age);
    }
}
