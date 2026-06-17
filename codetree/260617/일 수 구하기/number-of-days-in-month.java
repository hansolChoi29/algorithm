import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 아까 윤년이란 게 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년
        // 예외적으로 100으로 나누어 떨어지되 
        // 400으로 나누어 떨어지지 않는 해는 평년으로 합니다. 근데 이거 지금 필요없음
        if(n == 2){
            System.out.println(28);
            // 근데 7월 기준으로 홀짝이 바뀐다는 규칙을 반영하면?
        }else if(n <= 7){
            System.out.println(n % 2 == 1 ? 31 : 30);
        }else{
            System.out.println(n % 2 == 0 ? 31 : 30);
        }
    }
}