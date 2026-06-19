import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while(i <= N){
            System.out.print(
                i % 3 == 0 ||
                i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ||
                i / 10 == 3 || i / 10 == 6 || i / 10 == 9
                ? 0 + " " : i + " ");
            i++;
        }
    }
}