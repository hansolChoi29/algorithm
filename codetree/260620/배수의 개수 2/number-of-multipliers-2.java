import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();

            if(a % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}