import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        int age = sc.nextInt();

        System.out.println(
            gen == 0 && age >= 19 ? "MAN" :
            gen == 0 && age <= 19 ? "BOY" :
            gen == 1 && age >= 19 ? "WOMAN" : "GIRL"
        );
    }
}