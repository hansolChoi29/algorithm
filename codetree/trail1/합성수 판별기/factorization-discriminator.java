import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // N이 2 이상 N-1 이하의 정수로 떨어지면 합성수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean answer = false;

        for(int i = 2; i < n - 1; i++){
            if(n % i == 0){
                answer = true;
                break;
            }
        }
        System.out.println(answer == true ? 'C' : 'N');
    }
}