import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();

        while(N != 1){
            if(N % 2 == 0){
                N /= 2;
            }else{
                N = N * 3 + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}