import java.util.Scanner;

public class ArrayTask4_OddEvenSplit {
    // Split array into odd and even numbers preserving order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] odd = new int[n];
        int[] even = new int[n];
        int oi = 0, ei = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) { even[ei++] = a[i]; }
            else { odd[oi++] = a[i]; }
        }

        System.out.print("Array1 = ");
        for (int i = 0; i < oi; i++) {
            System.out.print(odd[i]);
            if (i < oi - 1) System.out.print(", ");
        }
        System.out.println();

        System.out.print("Array2 = ");
        for (int i = 0; i < ei; i++) {
            System.out.print(even[i]);
            if (i < ei - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}
