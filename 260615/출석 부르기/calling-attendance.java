import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(
            a == 1 ? "John" : 
            a == 2 ? "Tom" :
            a == 3 ? "Paul" : "Vacancy"
        );
    }
}