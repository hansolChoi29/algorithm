class Solution {
    public boolean solution(String s) {
        /*
        문자열 길이 4 혹은 6인지와
        숫자로만 구성되어있는지 확인하자
        */
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c < '0' || c > '9'){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}