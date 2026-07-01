class Solution {
    public String solution(String[] seoul) {
     for (int k = 0; k < seoul.length; k++) {
         if (seoul[k].equals("Kim")) {
            return "김서방은 " + k + "에 있다";
            }
        }
        return "";
    }
}