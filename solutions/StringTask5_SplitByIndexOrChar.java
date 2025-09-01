import java.util.Scanner;

public class StringTask5_SplitByIndexOrChar {
    // Split string into two by index (number) or by first occurrence of a character
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter an index number or character to split the string:");
        String token = sc.next();

        int split = -1;
        // try parse int
        try {
            split = Integer.parseInt(token);
            if (split < 0) split = 0;
            if (split > s.length()) split = s.length();
        } catch (Exception e) {
            // token is a character: find first occurrence
            char c = token.charAt(0);
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
