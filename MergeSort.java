import java.util.Random;

public class MergeSort {

    static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = p + (r - p) / 2;

            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void main(String[] args) {

        int n = 100000;
        int[] A = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(1000000);
        }

        long start = System.nanoTime();

        mergeSort(A, 0, n - 1);

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
