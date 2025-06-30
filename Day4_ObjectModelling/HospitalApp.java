package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Patient {
    String name;
    List<Doctor> consultedDoctors;

    Patient(String name) {
        this.name = name;
        consultedDoctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Patients under Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.name);
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare Hospital");

        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Khan");

        Patient p1 = new Patient("Riya");
        Patient p2 = new Patient("Aman");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();
        d1.showPatients();
        d2.showPatients();

        System.out.println();
        p1.showDoctors();
        p2.showDoctors();

        System.out.println();
        hospital.showHospitalInfo();
    }
}

