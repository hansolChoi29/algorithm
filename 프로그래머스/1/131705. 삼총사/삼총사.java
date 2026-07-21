class Solution {
    public int solution(int[] number) {
        /*
        한국중 학생들은 각자 정수 번호 보유
        학생 3명의 정수 번호를 더했을 때 0이되면 3명의 학생은 삼총사라고 함
        삼총사 만들 방법의 개수 구하기
        */
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}