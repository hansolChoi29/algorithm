import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 10미만의 정수 2개 
        // 첫 번째
        // 두 번째
        // 세 번째 항부터는 전전항 + 전항 -- 피보나치
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for(int i = 2; i < 10; i++){
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
        }

        for(int i = 0; i < 10; i++){
          System.out.printf(arr[i]+" ");
        }
    }
}