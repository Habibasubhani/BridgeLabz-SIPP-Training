package LocalRepo.Day1_LinkedList;

import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    String priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularLinkedList {
    Task head = null;
    Task tail = null;
    Task current = null;
    void addAtBeginning(int taskId, String taskName, String priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }
    void addAtEnd(int taskId, String taskName, String priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }
    void addAtPosition(int pos, int taskId, String taskName, String priority, String dueDate) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) {
            tail = newTask;
        }
    }
    void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks in list.");
            return;
        }

        Task temp = head, prev = tail;
        do {
            if (temp.taskId == taskId) {
                if (temp == head && temp == tail) { // Only one node
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task ID not found.");
    }
    void viewAndMoveToNext() {
        if (current == null) {
            current = head;
        }
        if (current == null) {
            System.out.println("No tasks to show.");
            return;
        }
        System.out.println("Current Task: ID=" + current.taskId + ", Name=" + current.taskName +
                ", Priority=" + current.priority + ", Due=" + current.dueDate);
        current = current.next;
    }

    void displayAll() {
        if (head == null) {
            System.out.println("No tasks in list.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

   
    void searchByPriority(String priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println("Found Task: ID=" + temp.taskId + ", Name=" + temp.taskName +
                        ", Due=" + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task found with priority: " + priority);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        while (true) {
            System.out.println("\n--- TASK SCHEDULER MENU ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Specific Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View & Move to Next Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    System.out.print("Enter Task ID, Name, Priority, Due Date: ");
                    scheduler.addAtBeginning(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter Task ID, Name, Priority, Due Date: ");
                    scheduler.addAtEnd(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter Task ID, Name, Priority, Due Date: ");
                    scheduler.addAtPosition(pos, sc.nextInt(), sc.next(), sc.next(), sc.next());
                    break;
                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    scheduler.removeByTaskId(sc.nextInt());
                    break;
                case 5:
                    scheduler.viewAndMoveToNext();
                    break;
                case 6:
                    scheduler.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Priority to search: ");
                    scheduler.searchByPriority(sc.next());
                    break;
                case 8:
                    System.out.println("Exiting scheduler.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

