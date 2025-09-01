import java.util.Scanner;

public class StringTask5_SplitByIndexOrChar {
    // Split string into two by index (number) or by first occurrence of a character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter an index number or character to split the string:");
        String token = sc.nextLine();
        int split = -1;
        // check if token is an integer (manual parsing)
        boolean isNum = true;
        int idx = 0;
        boolean neg = false;
        if (token == null || token.length() == 0) isNum = false;
        else {
            if (token.charAt(0) == '-') { neg = true; idx = 1; if (token.length() == 1) isNum = false; }
        }
        long acc = 0;
        for (int i = idx; i < token.length() && isNum; i++) {
            char c = token.charAt(i);
            if (c < '0' || c > '9') { isNum = false; break; }
            acc = acc * 10 + (c - '0');
            if (acc > Integer.MAX_VALUE) { acc = Integer.MAX_VALUE; break; }
        }
        if (isNum) {
            int val = (int)(neg ? -acc : acc);
            split = val;
            if (split < 0) split = 0;
            if (split > s.length()) split = s.length();
        } else {
            // token treated as a character: use first char if present
            char c = (token.length() > 0) ? token.charAt(0) : '\0';
            split = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) { split = i + 1; break; }
            }
            if (split == -1) split = s.length();
        }

        String s1 = s.substring(0, split);
        String s2 = s.substring(split);

        System.out.println("String1 = " + s1);
        System.out.println("String2 = " + s2);
        sc.close();
    }
}
