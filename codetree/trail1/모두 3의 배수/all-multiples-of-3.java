import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 3의 배수냐?
        Scanner sc = new Scanner(System.in);
        int answer = 1;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();

            if (n % 3 != 0) {
                answer = 0;
            }
        }

        System.out.println(answer);
    }
}