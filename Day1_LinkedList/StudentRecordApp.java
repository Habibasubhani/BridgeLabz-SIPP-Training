package LocalRepo.Day1_LinkedList;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head = null;
    void addAtBeginning(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    void addAtEnd(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }
    void addAtPosition(int pos, int rollNo, String name, int age, String grade) {
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        Student newStudent = new Student(rollNo, name, age, grade);
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }
    void deleteByRoll(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record deleted.");
        }
    }
    void searchByRoll(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    void updateGrade(int rollNo, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    void displayAll() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Grade by Roll Number");
            System.out.println("7. Display All Records");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter Roll No, Name, Age, Grade: ");
                    list.addAtPosition(pos, sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    list.deleteByRoll(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll No to search: ");
                    list.searchByRoll(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Roll No and New Grade: ");
                    list.updateGrade(sc.nextInt(), sc.next());
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}


