import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char 에이증상 = sc.next().charAt(0);
        int 에이체온 = sc.nextInt();
        char 비증상 = sc.next().charAt(0);
        int 비체온 = sc.nextInt();
        char 씨증상 = sc.next().charAt(0);
        int 씨체온 = sc.nextInt();

        int count = 0;

        if(에이증상 == 'Y' && 에이체온 >= 37) count++;
        
        if(비증상 == 'Y' && 비체온 >= 37) count++;
        
        if(씨증상 == 'Y' && 씨체온 >= 37) count++;
       
       System.out.println(count >= 2 ? 'E' : 'N');
    }
}