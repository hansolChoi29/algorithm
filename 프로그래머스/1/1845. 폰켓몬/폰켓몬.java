import java.util.*;

class Solution {
    public int solution(int[] nums) {
        /*
        N마리 폰켓몬 중 N/2마리 가져갈 것
        */
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        return Math.min(nums.length / 2, set.size());
    
    }
}