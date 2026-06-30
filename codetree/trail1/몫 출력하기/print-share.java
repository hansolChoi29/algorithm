import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while(count < 3){
            int num = sc.nextInt();
            
            if(num % 2 != 0){
                continue;
            }
            
            System.out.println(num / 2); 
            
            count++;
        }
    }
}