import java.util.Scanner;
public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " added to queue.");
    }

    static void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {

            System.out.println(front.data + " removed from queue.");

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }
    
    static void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {

            Node temp = front;

            System.out.println("Queue values:");

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter value: ");
                int value = sc.nextInt();

                enqueue(value);
            }

            else if (choice == 2) {
                dequeue();
            }

            else if (choice == 3) {
                display();
            }

            else if (choice == 4) {
                System.out.println("Program ended.");
            }

            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}