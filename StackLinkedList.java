import java.util.Scanner;
public class StackLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed into stack.");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
        }
    }

    static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;

            System.out.println("Stack values:");

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
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                int value = sc.nextInt();
                push(value);
            }

            else if (choice == 2) {
                pop();
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