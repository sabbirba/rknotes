import java.util.Scanner;

public class ArrayTask1_Maximum {
    // Read n numbers into an array and print the maximum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("0"); sc.close(); return; }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int max = a[0];
        for (int i = 1; i < n; i++) if (a[i] > max) max = a[i];

        System.out.println(max);
        sc.close();
    }
}
