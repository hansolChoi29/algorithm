class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        System.out.println(answer);
        
        for(int i = 1; i <= count; i++){
            total += price * i;
        }
        System.out.println(answer);

        answer = total - money;
        System.out.println(answer);
        
        if (answer < 0) {
            answer = 0;
        }
        
        return answer;
    }
}