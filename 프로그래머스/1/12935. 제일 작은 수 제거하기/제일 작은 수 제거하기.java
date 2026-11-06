class Solution {
    public int[] solution(int[] arr) {
        /*
        최솟값을 먼저 찾고
        최솟값을 제외한 배열을 만들어서
        배열 길이가 1이면 -1 담아서 리턴하면 됨
        */
        
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = Math.min(answer, arr[i]);
        }

        int[] result = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != answer) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}