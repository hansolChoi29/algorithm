import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a/b + ".");

        int remain = a % b;
        for(int i = 0; i < 20; i++){
            remain *= 10;
            System.out.print(remain / b);
            remain %= b;
        }
    }
}