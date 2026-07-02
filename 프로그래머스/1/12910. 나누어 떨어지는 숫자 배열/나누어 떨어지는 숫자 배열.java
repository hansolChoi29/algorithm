import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
         int count = 0;

        // 1. divisor로 나누어 떨어지는 숫자가 몇 개인지 센다
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 2. 하나도 없으면 [-1] 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 3. 개수만큼 배열 만들기
        int[] answer = new int[count];
        int index = 0;

        // 4. 나누어 떨어지는 숫자만 answer에 담기
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index] = num;
                index++;
            }
        }

        // 5. 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}