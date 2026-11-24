/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C){
            System.out.println(10000 + A * 1000);
        }else if (A == B){
            System.out.println(1000 + A * 100);
        }else if (A == C){
            System.out.println(1000 + A * 100);
        }else if (B == C){
            System.out.println(1000 + B * 100);
        }else{
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
        }
    }
}