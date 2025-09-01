import java.util.Scanner;

public class ArrayTask3_PosNegSplit {
    // Split into positives and negatives preserving order
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
