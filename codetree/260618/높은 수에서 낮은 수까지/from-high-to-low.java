import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a > b ? a : b;
        int min = a > b ? b : a;

        for(int i = max; i >= min; i--){
            System.out.print(i + " ");
        }
    }
}