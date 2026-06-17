import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        char aGen= sc.next().charAt(0);
        int bAge = sc.nextInt();
        char bGen= sc.next().charAt(0);

       System.out.println(
            (aAge >= 19 && aGen == 'M')
            || (bAge >= 19 && bGen == 'M')
            ? 1 : 0
        );
    }
}