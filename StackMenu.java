import java.util.Scanner;
public class StackMenu  {
    static int[] stack=new int[10];
    static int top = -1;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n ----Stack Menu---- ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    if(top==9){
                        System.out.println("Stack is full, overflow");
                    }
                    else{
                        System.out.println("Enter value to push: ");
                        int value=sc.nextInt();
                        top=top+1;
                        stack[top]=value;
                        System.out.println("Pushed "+ value +" onto the stack");
                    }
                    break;
                    case 2:
                        if(top==-1){
                            System.out.println("Stack is empty, underflow");
                        }
                        else{
                            int poppedValue=stack[top];
                            top=top-1;
                            System.out.println("Popped value:"+poppedValue);
                        }
                        break;
                    case 3:
                        if (top==-1){
                            System.out.println("Stack is empty");
                        }
                        else{
                            System.out.println("Stack elements(top to bottom): ");
                            for(int i=top; i>=0;i--){
                                System.out.println(stack[i]);
                            }
                        }
                        break;
                        case 4:
                            System.out.println("Current size of stack"+(top+1));
                            break;
                        case 5:
                            if(top==-1){
                                System.out.println("Stack is empty");
                            }
                            else{
                                System.out.println("Stack is not empty");
                            }
                            break;
                        case 6:
                            if(top==9){
                                System.out.println("Stack is full");
                            }
                            else{
                                System.out.println("Stack is not full");
                            }
                            break;
                        case 7:
                            System.out.println("Exiting the program.....");
                            break;
                default:
                    System.out.println("Invalid choice! ");
                    break;
            }
        }while(choice!=7);
        sc.close();
    }

}
