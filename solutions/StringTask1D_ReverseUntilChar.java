import java.util.Scanner;

public class StringTask1D_ReverseUntilChar {
    // Reverse the string up to the first occurrence of a given character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter a character:");
        char c = sc.next().charAt(0);

        int idx = -1;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == c) {
                idx = i;
                break;
            }
            i++;
        }

        if (idx == -1) {
            // char not found: reverse entire string
            idx = s.length() - 1;
        }

        String rev = "";
        for (int j = idx; j >= 0; j--) {
            rev = rev + s.charAt(j);
        }

        System.out.println(rev);
        sc.close();
    }
}
