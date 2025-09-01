import java.util.Scanner;

public class StringTask2B_ReplaceWithX {
    // Replace all occurrences of a character with 'X' and print
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter a character:");
        char c = sc.next().charAt(0);

        String out = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c) out = out + 'X';
            else out = out + ch;
        }

        System.out.println(out);
        sc.close();
    }
}
