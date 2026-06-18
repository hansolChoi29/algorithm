import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] array = new int[]{a, b, c};
        Arrays.sort(array);

        System.out.println(array[1]);
    }
}