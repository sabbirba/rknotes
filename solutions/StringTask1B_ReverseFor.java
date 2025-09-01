import java.util.Scanner;

public class StringTask1B_ReverseFor {
    // Reverse a string using a for loop only
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
        sc.close();
    }
}
