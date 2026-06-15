import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        System.out.printf(score >= 80 ? "pass" : "%d more score", 80 - score);
    }
}