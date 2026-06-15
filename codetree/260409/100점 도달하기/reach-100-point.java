import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = N; i <= 100; i++){
            System.out.print((i >= 90 ? 'A' 
            : i >= 80 ? 'B' 
            : i >= 70 ? 'C' 
            : i >= 60 ? 'D' 
            : 'F')+" ");
        }
    }
}