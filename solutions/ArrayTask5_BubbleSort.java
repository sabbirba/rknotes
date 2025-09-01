import java.util.Scanner;

public class ArrayTask5_BubbleSort {
    // Read numbers and sort using bubble sort then print ascending
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}
