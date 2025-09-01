import java.util.Scanner;

public class ArrayTask4_OddEvenSplit {
    // Split array into odd and even numbers preserving order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        String line = sc.nextLine();
        int n = 0;
        boolean ok = true;
        if (line == null || line.length() == 0) ok = false;
        if (ok) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c < '0' || c > '9') { ok = false; break; }
                n = n * 10 + (c - '0');
            }
        }
        if (!ok) n = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            String numLine = sc.nextLine();
            int val = 0;
            boolean valid = true;
            int idx = 0;
            boolean neg = false;
            if (numLine == null || numLine.length() == 0) valid = false;
            else {
                if (numLine.charAt(0) == '-') { neg = true; idx = 1; if (numLine.length() == 1) valid = false; }
            }
            for (int j = idx; j < numLine.length() && valid; j++) {
                char c = numLine.charAt(j);
                if (c < '0' || c > '9') { valid = false; break; }
                val = val * 10 + (c - '0');
            }
            if (!valid) val = 0;
            if (neg) val = -val;
            a[i] = val;
        }

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
