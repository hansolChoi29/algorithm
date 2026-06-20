import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2일마다 교실
        // 3일마다 복도
        // 12일마다 화장실
        int classroom = 0;
        int hallway = 0;
        int bathroom = 0;


        // 날짜가 겹치는 날에는 주기가 더 긴 것을 함 - 우선순위 
        // n일간 진행했을 때 각 장소의 청소 횟수를 차례대로 출력해라
        for(int i = 1; i <= n; i++){
            if(i % 12 == 0){
                bathroom++;
            }else if(i % 3 == 0){
                hallway++;
            }else if(i % 2 == 0){
                classroom++;
            }
        }

        System.out.printf("%d %d %d", classroom, hallway, bathroom);
    }
}