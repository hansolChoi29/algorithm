import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(
            N % 2 == 0 ? 2 
            : N % 3 == 0 ? 3 
            : 5
        );
    }
}