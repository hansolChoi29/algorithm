import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int i = 1;

         while(true){
            
            N /= i;
            count++;
            if(N <= 1){
                System.out.println(count);
                break;
            }
            i++;
        }
    }
}