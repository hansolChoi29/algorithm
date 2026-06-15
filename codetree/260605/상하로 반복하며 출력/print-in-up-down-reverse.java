import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 그릇에 담고나서 출력을 하는데
        // 출력은 상하 반복..

        /*
        짝수번째 열: 1234
        홀수번째 열: 4321 
        ...
                j = 0 / j = 1 / j = 2 / j = 3
        i = 0 :     1       4       1       4   
        i = 1 :     2       3       2       3
        i = 2 :     3       2       3       2
        i = 3 :     4       1       4       1

        즉, 열 기준으로 
        홀수 : 4321
        짝수 : 1234
        */

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j % 2 == 0){
                    System.out.print(i + 1);
                }else{
                    System.out.print(N - i);
                }
            }
            System.out.println();
        }
    }
}