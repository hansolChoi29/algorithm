import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[4][4];
        int count = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = sc.nextInt();

                if(array[i][j] % 5 == 0){
                    count++;
                }
            }
        }        
        System.out.println(count);
    }
}