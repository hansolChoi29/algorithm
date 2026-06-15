import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        String[] strArr = N.split("-");
        System.out.println(strArr[2]+"."+strArr[0]+"."+strArr[1]);
    }
}