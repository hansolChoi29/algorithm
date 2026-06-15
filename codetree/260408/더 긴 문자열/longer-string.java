import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(
                A.length() > B.length() ? A + " " + A.length()
                : A.length() < B.length() ? B + " " + B.length()
                : "same"
            );
    }
}