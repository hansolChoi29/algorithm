/*
점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x > 0 && y > 0){
            System.out.println(1);
        }else if(x > 0 && y < 0){
            System.out.println(4);
        }else if(x < 0 && y < 0){
            System.out.println(3);
        }else{
            System.out.println(2);
        }
    }
}