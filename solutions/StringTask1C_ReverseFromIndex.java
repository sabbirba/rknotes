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
        // Read the user's number as a line and validate manually using if/else
        String numLine = sc.nextLine();
        if (numLine != null && numLine.length() > 0) {
            boolean isNumber = true;
            int startIdx = 0;
            // allow an optional leading '-' for negative numbers
            if (numLine.charAt(0) == '-') {
                if (numLine.length() == 1) {
                    isNumber = false; // only a minus sign is not a number
                } else {
                    startIdx = 1;
                }
            }

            // check each remaining character is a digit
            for (int i = startIdx; i < numLine.length() && isNumber; i++) {
                char c = numLine.charAt(i);
                if (c < '0' || c > '9') {
                    isNumber = false;
                }
            }

            if (isNumber) {
                // manually convert digits to integer without using Integer.parseInt
                int sign = 1;
                int idxNum = 0;
                if (numLine.charAt(0) == '-') {
                    sign = -1;
                    idxNum = 1;
                }
                long acc = 0;
                for (int i = idxNum; i < numLine.length(); i++) {
                    acc = acc * 10 + (numLine.charAt(i) - '0');
                    // clamp to int range to avoid overflow
                    if (acc > Integer.MAX_VALUE) {
                        acc = Integer.MAX_VALUE;
                        break;
                    }
                }
                n = (int)(sign * acc);
            } else {
                // not a valid integer, keep n as -1
                n = -1;
            }
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
