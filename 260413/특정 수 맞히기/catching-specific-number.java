import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        // 정수 25를 맞춰라!

        while(true){
            int input = sc.nextInt();
            if(input < 25){
                System.out.println("Higher");
        
            }else if(input > 25){
                System.out.println("Lower");

            }else{
                System.out.println("Good");
                break;
            }
        }
    }
}