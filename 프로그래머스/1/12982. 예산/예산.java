import java.util.*;


class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        /*
        그리디??!
        */

        Arrays.sort(d);
        
        for(int money : d){
            if(budget < money){
                break;
            }
            
            budget -= money;
            answer++;
        }
        
        return answer;
    }
}