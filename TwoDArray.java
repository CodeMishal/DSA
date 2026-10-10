import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter array values:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n2D Array:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
