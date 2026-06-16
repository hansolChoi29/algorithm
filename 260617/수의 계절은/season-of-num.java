import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        System.out.println(
            3 <= M && M <= 5 ? "Spring" :
            6 <= M && M  <= 8 ? "Summer" :
            9 <= M && M  <= 11 ? "Fall" :"Winter" 
        );
    }
}