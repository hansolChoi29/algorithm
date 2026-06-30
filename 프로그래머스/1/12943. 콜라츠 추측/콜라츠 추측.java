class Solution {
    public int solution(int num) {
        // 6 3 10 5 16 8 4 2 1
        long n = num;
        int count = 0;
        
        while(n != 1){
            if(count == 500){
                return -1;
            }
            
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n * 3 + 1;
            }
            
            count++;
        }
        
        return count;
    }
}