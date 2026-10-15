class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int squareSum = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cubeSum = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a == b && b == c) {
            return sum * squareSum * cubeSum;
        }

        if (a == b || b == c || a == c) {
            return sum * squareSum;
        }

        return sum;
    }
}