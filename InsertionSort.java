import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int n = 100000;
        int[] A = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(1000000);
        }
        
        long start = System.nanoTime();

        for (int j = 1; j < n; j++) {
            int temp = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > temp) {
                A[i + 1] = A[i];
                i--;
            }

            A[i + 1] = temp;
        }

        long end = System.nanoTime();
        
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        long time = end - start;

        System.out.println("\n\nArray Size: " + n);
        System.out.println("Execution Time: " + time + " nanoseconds");
        System.out.println("Execution Time: "
                + time / 100000000.0 + " milliseconds");
    }
}
