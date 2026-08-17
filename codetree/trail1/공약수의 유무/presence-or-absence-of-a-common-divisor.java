import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean answer = false;

        for(int i = a; i <= b; i++){
            if(1920 % i == 0 && 2880 % i == 0){
                answer = true;
                break;
            }
        }

        System.out.println(answer == true ? 1 : 0);
    }
}