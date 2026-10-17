import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int n = 100000;
        int[] A = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(1000000);
        }

        long start = System.nanoTime();

        for (int U = 0; U < n - 1; U++) {
            int temp = A[U];
            int loc = U;

            for (int i = U + 1; i < n; i++) {
                if (temp > A[i]) {
                    temp = A[i];
                    loc = i;
                }
            }

            int T = A[loc];
            A[loc] = A[U];
            A[U] = T;
        }

        long end = System.nanoTime();

        long time = end - start;

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nArray Size: " + n);
        System.out.println("Execution Time: " + time + " nanoseconds");
        System.out.println("Execution Time: "
                + time / 100000000.0 + " milliseconds");
    }
}
