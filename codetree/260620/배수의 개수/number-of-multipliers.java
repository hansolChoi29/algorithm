import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int tcount = 0;
        int fcount = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            if(a % 3 == 0){
                tcount++;
            }
            if(a % 5 == 0){
                fcount++;
            }
        }
        System.out.printf("%d %d", tcount, fcount);
    }
}