import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int IN = sc.nextInt();
        int N = 0;
        
        for(int i = 1; i <= IN; i++){
            N += i;
        } 
        System.out.println(N);
    }
}