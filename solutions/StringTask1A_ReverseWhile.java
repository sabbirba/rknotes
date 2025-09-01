import java.util.Scanner;

public class StringTask1A_ReverseWhile {
    // Reverse a string using a while loop only
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s = sc.nextLine();

        String rev = "";
        int i = s.length() - 1;
        while (i >= 0) {
            rev = rev + s.charAt(i);
            i--;
        }

        System.out.println(rev);
        sc.close();
    }
}
