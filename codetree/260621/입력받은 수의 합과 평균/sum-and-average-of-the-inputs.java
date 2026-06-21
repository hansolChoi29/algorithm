import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            count++;
            sum += num;
        }
        double avg = (double) sum / count; 
        System.out.printf("%d %.1f", sum, avg);
    }
}