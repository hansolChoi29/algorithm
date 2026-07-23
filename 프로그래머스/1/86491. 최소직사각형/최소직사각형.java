class Solution {
    public int solution(int[][] sizes) {
        /*
        TODO : 명함 지갑 만들기
        - 다양한 모양의 크기 모두 수납 가능해야 함
        - 가로 길이 30 ~ 80
        - 세로 길이 30 ~ 70
        */ 
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int[] size : sizes){
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);
            
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxWidth * maxHeight;
    }
}