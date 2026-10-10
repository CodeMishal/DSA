import java.util.Scanner;
public class QueueMenu {
    static int[] queue=new int[10];
    static int front= -1;
    static int rear= -1;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n ----Queue Menu---- ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    if(rear==9){
                        System.out.println("Queue is full, overloaded");
                    }
                    else{
                        System.out.println("Enter token number: ");
                        int value=sc.nextInt();
                        if(front==-1){
                            front=0;
                        }
                        rear=rear+1;
                        queue[rear]=value;
                        System.out.println("Enqueued: "+value);
                    }
                    break;
                    case 2:
                        if(front==-1){
                        System.out.println("Queue is empty, underflow");
                        }
                        else{
                           int value=queue[front];
                           front=front+1;
                           if(front>rear){
                            front=-1;
                            rear=-1;
                           }
                        System.out.println("Dequeued "+ value);
                        }
                        break;
                    case 3:
                        if(front==-1){
                        System.out.println("Queue is empty");
                        }
                        else{
                        System.out.println("Queue elements(front to rear): ");
                        for(int i=front; i<=rear;i++){
                        System.out.println(queue[i]);
                        }
                        }
                        break;
                    case 4:
                        if (front==-1){
                        System.out.println("Current size of queue: 0");
                        }
                        else{
                        System.out.println("Current size of queue:"+(rear-front+1));
                        }
                        break;
                    case 5:
                        if(front==-1){
                        System.out.println("Queue is empty");
                        }
                        else{
                        System.out.println("Queue is not empty");
                        }
                        break;
                    case 6:
                        if(rear==9){
                        System.out.println("Queue is full");
                        }
                        else{
                        System.out.println("Queue is not full");
                        }
                        break;
                    case 7:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
            }
        }while(choice!=7);
        sc.close();
    }
}