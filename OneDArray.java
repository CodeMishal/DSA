import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];
        int size, choice;
        int value, position;
        int found;

        System.out.print("Enter number of elements: ");
        size = input.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        while (true) {
            System.out.println("\n--- 1D Array Menu ---");
            System.out.println("1. Traversal");
            System.out.println("2. Insertion");
            System.out.println("3. Deletion");
            System.out.println("4. Searching");
            System.out.println("5. Sorting");
            System.out.println("6. Updation");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Array elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    if (size == arr.length) {
                        System.out.println("Array is full.");
                        break;
                    }

                    System.out.print("Enter value to insert: ");
                    value = input.nextInt();

                    System.out.print("Enter position (1 to "
                            + (size + 1) + "): ");
                    position = input.nextInt();

                    if (position < 1 || position > size + 1) {
                        System.out.println("Invalid position.");
                    } else {
                        for (int i = size; i >= position; i--) {
                            arr[i] = arr[i - 1];
                        }

                        arr[position - 1] = value;
                        size++;

                        System.out.println("Value inserted.");
                    }
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    System.out.print("Enter position to delete (1 to "
                            + size + "): ");
                    position = input.nextInt();

                    if (position < 1 || position > size) {
                        System.out.println("Invalid position.");
                    } else {
                        for (int i = position - 1; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        size--;
                        System.out.println("Value deleted.");
                    }
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    value = input.nextInt();
                    found = -1;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == value) {
                            found = i;
                            break;
                        }
                    }

                    if (found == -1) {
                        System.out.println("Value not found.");
                    } else {
                        System.out.println("Value found at position "
                                + (found + 1));
                    }
                    break;

                case 5:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = 0; j < size - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Array sorted in ascending order.");
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    System.out.print("Enter position to update (1 to "
                            + size + "): ");
                    position = input.nextInt();

                    if (position < 1 || position > size) {
                        System.out.println("Invalid position.");
                    } else {
                        System.out.print("Enter new value: ");
                        value = input.nextInt();

                        arr[position - 1] = value;
                        System.out.println("Value updated.");
                    }
                    break;

                case 7:
                    System.out.println("Program ended.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
