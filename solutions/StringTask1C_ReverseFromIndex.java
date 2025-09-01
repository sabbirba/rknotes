import java.util.Scanner;

public class StringTask1C_ReverseFromIndex {
    // Reverse the later part of a string from a given number (index)
    // If the user enters n, reverse substring from n to end (0-based assumed)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter a number:");
        int n = -1;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        if (n < 0) n = 0;
        if (n > s.length()) n = s.length();

        String sub = s.substring(n);
        String rev = "";
        for (int i = sub.length() - 1; i >= 0; i--) {
            rev = rev + sub.charAt(i);
        }

        System.out.println(rev);
        sc.close();
    }
}
