import java.util.Scanner;
public class ArrayMenu{
    static int[] arr = new int[10];
    static int size = 0;

    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int choice;
        do{
            System.out.println("\n ----Array Menu----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill the array");
            System.out.println("4. Delete the last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display all the elements");
            System.out.println("7. Search for a value");
            System.out.println("8. Get the value");
            System.out.println("9. Update the value at specific index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if (size == 10){
                        System.out.println("Array full, overflow");
                    }
                    else{
                        System.out.println("Enter book ID: ");
                        int value = sc.nextInt();
                        arr[size]= value;
                        size= size+1;
                        System.out.println("Value added successfully !");
                    }
                    break;
                    case 2:
                        if (size==10){
                            System.out.println("Array full, overflow");
                        }
                        else{
                            System.out.println("Enter index to insert at: ");
                            int index = sc.nextInt();
                            if(index < 0 || index > size){
                                System.out.println("Invalid Index!");
                            }
                            else{
                                System.out.println("Enter book ID:");
                                int value=sc.nextInt();
                                for(int i=size; i>index; i--){
                                    arr[i]=arr[i-1];
                                }
                                arr[index]= value;
                                size = size+1;
                                System.out.println("Value inserted successfully!");
                            }
                        }
                        break;
                        case 3:
                            while(true){
                                if(size==10){
                                    System.out.println("Array full,overflow");
                                    break;
                                }
                                System.out.println("Enter book ID:");
                                int value=sc.nextInt();
                                arr[size]=value;
                                size=size+1;
                                System.out.println("Value added. Current size:"+size);
                                System.out.println("Add another value? (1= Yes , 0=No):");
                                int cont=sc.nextInt();
                                if(cont==0){
                                    break;
                                }
                            }
                            System.out.println("Array is filled ");
                            break;
                            case 4:
                                if (size==0){
                                    System.out.println("Array is empty, underflow");
                                }
                                else{
                                    int deletedValue=arr[size-1];
                                    size=size-1;
                                    System.out.println("Deleted Value"+deletedValue);
                                }
                                break;
                                case 5:  
                                    if(size==0){
                                        System.out.println("Array is empty, underflow");
                                    }
                                    else{
                                         System.out.println("Enter index to delete: ");
                                         int index =sc.nextInt();
                                         if(index<0 || index>=size){
                                            System.out.println("Invalid book ID");
                                         }
                                         else{
                                            for(int i=index; i<size-1; i++){
                                                arr[i]=arr[i+1];
                                            }
                                            size=size-1;
                                            System.out.println("Book ID deleted successfully.");
                                         }
                                    }
                                    break;
                                    case 6:
                                        if(size==0){
                                            System.out.println("Array is empty");
                                        }
                                        else{
                                            System.out.println("Array elements:");
                                            for(int i=0;i<size;i++){
                                                System.out.println("Book ID"+i+":"+arr[i]);
                                            }
                                        }
                                        break;
                                        case 7:
                                            System.out.println("Enter value to search:");
                                            int target=sc.nextInt();
                                            boolean found=false;
                                            for(int i=0;i<size;i++){
                                                if(arr[i]==target){
                                                    System.out.println("Found at index"+i);
                                                    found=true;
                                                    break;
                                                }
                                            }
                                            if(!found){
                                                System.out.println("Value not found");
                                            }
                                            break;
                                            case 8:
                                                System.out.println("Enter index: ");
                                                int idx=sc.nextInt();
                                                if(idx<0 || idx>=size){
                                                    System.out.println("Invalid book ID");
                                                }
                                                else{
                                                    System.out.println("Value at index"+idx+":"+arr[idx]);
                                                }
                                                break;
                                                case 9:
                                                    System.out.println("Enter index to update: ");
                                                    int idxx =sc.nextInt();
                                                    if(idxx<0 || idxx>=size){
                                                        System.out.println("Invalid book ID");
                                                    }
                                                    else{
                                                        System.out.println("Enter new value: ");
                                                        int newValue=sc.nextInt();
                                                        arr[idxx]=newValue;
                                                        System.out.println("Value updated successfully!");
                                                    }
                                                    break;
                                                    case 10:
                                                        System.out.println("Current size of array: "+size);
                                                        break;
                                                    case 11:
                                                        System.out.println("Exiting the program.... ");
                                                        break;
                                                        default:
                                                            System.out.println("Invalid choice!");
        }
    }while(choice!=11);
    sc.close();
}

}