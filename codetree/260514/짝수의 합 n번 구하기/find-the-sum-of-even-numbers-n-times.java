import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
       Scanner sc = new Scanner(System.in);
        // 첫번째 줄 테스트케이스 수
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            // 두번째 줄 N개의 줄에 걸쳐 한 줄에 a, b
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 0;

            for (int num = a; num <= b; num++) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }

            System.out.println(sum);
        }
    }
}