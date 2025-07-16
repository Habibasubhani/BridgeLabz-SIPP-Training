package LocalRepo.Day1_LinkedList;

import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class CircularProcessQueue {
    Process head = null;
    Process tail = null;
    void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }
    void removeProcess(int pid) {
        if (head == null) return;

        Process current = head;
        Process prev = tail;

        do {
            if (current.pid == pid) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }
    void displayQueue() {
        if (head == null) {
            System.out.println("No processes.");
            return;
        }
        Process temp = head;
        do {
            System.out.println("PID: " + temp.pid + ", BT: " + temp.burstTime + ", RT: " + temp.remainingTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
    void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        List<Integer> completionOrder = new ArrayList<>();
        Map<Integer, Integer> waitingMap = new HashMap<>();
        Map<Integer, Integer> turnaroundMap = new HashMap<>();

        Process current = head;
        while (head != null) {
            displayQueue();

            if (current.remainingTime <= timeQuantum) {
                time += current.remainingTime;
                current.remainingTime = 0;
                turnaroundMap.put(current.pid, time);
                waitingMap.put(current.pid, time - current.burstTime);
                System.out.println("Process " + current.pid + " completed at time " + time);
                completionOrder.add(current.pid);

                int pidToRemove = current.pid;
                current = current.next;
                removeProcess(pidToRemove);
                if (head == null) break;
            } else {
                time += timeQuantum;
                current.remainingTime -= timeQuantum;
                current = current.next;
            }
            System.out.println("Time elapsed: " + time);
        }
        double totalWaiting = 0, totalTurnaround = 0;
        for (int pid : completionOrder) {
            totalWaiting += waitingMap.get(pid);
            totalTurnaround += turnaroundMap.get(pid);
        }

        System.out.println("\n--- Completion Report ---");
        for (int pid : completionOrder) {
            System.out.println("PID: " + pid +
                    ", Waiting Time: " + waitingMap.get(pid) +
                    ", Turnaround Time: " + turnaroundMap.get(pid));
        }

        System.out.println("\nAverage Waiting Time: " + (totalWaiting / completionOrder.size()));
        System.out.println("Average Turnaround Time: " + (totalTurnaround / completionOrder.size()));
    }
}

public class RoundRobinScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularProcessQueue queue = new CircularProcessQueue();

        while (true) {
            System.out.println("\n--- ROUND ROBIN SCHEDULER ---");
            System.out.println("1. Add Process");
            System.out.println("2. Display Process Queue");
            System.out.println("3. Simulate Round Robin");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter PID, Burst Time, Priority: ");
                    queue.addProcess(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    queue.displayQueue();
                    break;
                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int tq = sc.nextInt();
                    queue.simulate(tq);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

