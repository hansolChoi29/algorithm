import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] newStr = str.split("-");

        System.out.printf("%s-%s-%s", newStr[0], newStr[2], newStr[1]);
    }
}