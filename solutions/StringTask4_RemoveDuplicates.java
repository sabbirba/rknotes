import java.util.Scanner;

public class StringTask4_RemoveDuplicates {
    // Remove duplicate characters, keep first occurrences; case-sensitive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        String out = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean seen = false;
            for (int j = 0; j < out.length(); j++) {
                if (out.charAt(j) == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) out = out + c;
        }

        System.out.println(out);
        sc.close();
    }
}
