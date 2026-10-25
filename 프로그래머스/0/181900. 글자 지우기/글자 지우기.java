class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        boolean[] deleted = new boolean[my_string.length()];

        // 삭제할 인덱스 표시
        for (int i = 0; i < indices.length; i++) {
            deleted[indices[i]] = true;
        }

        // 삭제 대상이 아닌 문자만 추가
        for (int i = 0; i < my_string.length(); i++) {
            if (!deleted[i]) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}