import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int 넓이 = N * N;
        System.out.println(넓이);

        if(N < 5){
            System.out.println("tiny");
        }
    }
}