import java.util.Scanner;

public class ArrayTask3_PosNegSplit {
    // Split into positives and negatives preserving order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] pos = new int[n];
        int[] neg = new int[n];
        int pi = 0, ni = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) { pos[pi++] = a[i]; }
            else { neg[ni++] = a[i]; }
        }

        // print only filled parts
        System.out.print("Array1 = ");
        for (int i = 0; i < pi; i++) {
            System.out.print(pos[i]);
            if (i < pi - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.print("Array2 = ");
        for (int i = 0; i < ni; i++) {
            System.out.print(neg[i]);
            if (i < ni - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}
