import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char N = sc.next().charAt(0);
        System.out.println(
            N == 'S' ? "Superior" :
            N == 'A' ? "Excellent" :
            N == 'B' ? "Good" :
            N == 'C' ? "Usually" :
            N == 'D' ? "Effort" : "Failure"
        );
    }
}