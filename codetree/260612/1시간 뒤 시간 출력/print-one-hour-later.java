import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        String[] strArr = N.split(":");

        // 형변환
        int h = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);

        h += 1;
        System.out.println(h + ":" + m);
    }
}