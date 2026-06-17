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
        }else if(
            n == 1 || 
            n == 3 || 
            n == 5 || 
            n == 7 || 
            n == 8 || 
            n == 10 ||
             n == 12
        ){
            System.out.println(31);
        }else{
            System.out.println(30);
        }
    }
}