import java.util.Scanner;

public class StringTask6_UppercaseToEnd {
    // Move uppercase letters to the end of the string preserving order, remove spaces
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        String lower = "";
        String upper = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue; // remove spaces
            if (c >= 'A' && c <= 'Z') upper = upper + c;
            else lower = lower + c;
        }

        System.out.println(lower + upper);
        sc.close();
    }
}
