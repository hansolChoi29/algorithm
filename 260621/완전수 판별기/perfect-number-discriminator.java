import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 완전수 : 자기 자신을 제외한 약수의 합
        // 예를들어 6이라면, 1 + 2 + 3 
        // 약수를 구하려면  N % i == 0 이면 됨
        int sum = 0;

        for(int i = 1; i < N; i++){
            if(N % i == 0 && N != i){
                // 이게 완전수인데, 
                sum += i;
            }
        }

        if(sum == N){
            System.out.println("P");
        }else{
            System.out.println("N");
        }
    }
}