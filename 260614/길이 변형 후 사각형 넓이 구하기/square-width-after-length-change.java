import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int 가로 = sc.nextInt();
        int 세로 = sc.nextInt();
        가로 += 8;
        세로 *= 3;
        System.out.printf("%d\n%d\n%d", 가로, 세로, 가로 * 세로);
    }
}