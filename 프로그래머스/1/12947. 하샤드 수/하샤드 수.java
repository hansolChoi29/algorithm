class Solution {
    public boolean solution(int x) {
        // 하샤드 수 
        // x = 18, 1 + 8 = 9 그리고 18 % 9 = 0 이게 하샤드 수
        int num = x;
        int sum = 0;
        
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        return num % sum == 0;
    }
}