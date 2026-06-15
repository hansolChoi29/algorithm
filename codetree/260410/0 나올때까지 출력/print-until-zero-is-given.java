import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int 입력 = sc.nextInt();
        while(true){
            if(입력==0){
                break;
            }
            System.out.println(입력);
            입력 = sc.nextInt();
        }
    }
}