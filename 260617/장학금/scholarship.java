import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int midterm_exam = sc.nextInt();
        int final_exam = sc.nextInt();
        
        if(midterm_exam >= 90){
            System.out.println(
                final_exam >= 95 ? 100000 :
                final_exam >= 90 ? 50000 : 0
            );
        }else{
            System.out.println(0);
        }
    }
}