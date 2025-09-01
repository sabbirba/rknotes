import java.util.Scanner;

public class StringTask2A_CheckChar {
    // Check if a character exists in the string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();
        System.out.println("Please enter a character:");
        char c = sc.next().charAt(0);

        boolean found = false;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == c) {
                found = true;
                break;
            }
            i++;
        }

        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
