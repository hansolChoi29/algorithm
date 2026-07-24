class Solution {
    public int[] solution(int n, int m) {
        /*
        todo : 유클리드 호제법 사용해볼 것
        
        (큰 수, 작은 수) -> (작은 수, 나머지)
        (48,18)
        -> (18,12)
        -> (12,6)
        -> (6,0)
        */ 
        
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }
    
     private int gcd(int a, int b) {
        while (b != 0) {
        
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}