import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        // N 값에 따라 같은 연산을 진행
        // cnt 번의 연산을 햿을 때 처음으로 1000 이상이 된다고 함 <- 뭔말?
        // N % 2 == 0 ?  N * 3 + 1 : N * 2 + 2
        // cnt 값은? : 이렇게해서 나온 값들이 1000 이상이 되면 몇 번 했을 때임?
        int cnt = 0;
        while(n < 1000){
            n = n % 2 == 0 ? n * 3 + 1 : n * 2 + 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}