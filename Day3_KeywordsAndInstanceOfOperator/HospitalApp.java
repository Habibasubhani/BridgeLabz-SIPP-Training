package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Object p1 = new Patient(201, "Arjun", 35, "Flu");
        Object p2 = new Patient(202, "Neha", 28, "Infection");

        if (p1 instanceof Patient) {
            Patient patient1 = (Patient) p1;
            patient1.displayPatientDetails();
            System.out.println();
        }

        if (p2 instanceof Patient) {
            Patient patient2 = (Patient) p2;
            patient2.displayPatientDetails();
            System.out.println();
        }

        Patient.getTotalPatients();
    }
}


