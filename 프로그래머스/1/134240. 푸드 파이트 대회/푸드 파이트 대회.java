class Solution {
    public String solution(int[] food) {
         StringBuilder left = new StringBuilder();
        
        // 왼쪽 선수가 먹을 음식 순서를 저장한다
        // 문자열을 반복해서 추가해야 하므로 StringBuilder를 사용한다
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;

            for (int j = 0; j < count; j++) {
                // append(): StringBuilder의 맨 뒤에 값을 추가하는 메서드
                left.append(i);
            }
        }

        // new StringBuilder(left)
        //  기존 left를 복사해서 새로운 StringBuilder를 만든다
        //
        // reverse()
        //  문자열의 순서를 반대로 뒤집는다
        //
        // toString()
        //  StringBuilder를 최종 String으로 변환한다
        String right = new StringBuilder(left).reverse().toString();

        return left + "0" + right;
    }
}