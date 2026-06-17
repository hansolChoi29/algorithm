import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        // 4로 나누어 떨어지면 ? 윤년 : 평년
        // 예외적으로   Y % 100 == 0 && Y % 400 != 0 == 평년
        System.out.println(
           (Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0) ? "true" : "false"
        );
    }
}