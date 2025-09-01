import java.util.Scanner;

public class StringTask3_EvenOddPositions {
    // Create two strings: chars at even positions and at odd positions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        String s1 = ""; // even positions (0,2,..)
        String s2 = ""; // odd positions (1,3,..)

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) s1 = s1 + s.charAt(i);
            else s2 = s2 + s.charAt(i);
        }

        System.out.println("String1 = " + s1);
        System.out.println("String2 = " + s2);
        sc.close();
    }
}
