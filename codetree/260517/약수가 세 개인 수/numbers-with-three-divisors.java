import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(); // 3
        int end = sc.nextInt(); // 7
        // 3, 4, 5, 6, 7중, 약수가 3개 즉, 본인 포함해서  3개인 거 몇 개냐..?
        // 소수 제곱..
        // num을 start~end까지.
        // i를 1부터 num까지 나눠보고 나머지 0이면 count++;
        // count == 3이면 answer++;
        int answer = 0;
        // num : 3 ~ 7
        for(int num = start; num <= end; num++){
            int divisorCount = 0;
            // 1. num : 3
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    divisorCount++;
                }
            }
            if(divisorCount == 3){
                answer++;
            }
        }
            System.out.println(answer);
    }
}