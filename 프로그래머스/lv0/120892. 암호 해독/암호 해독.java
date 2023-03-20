class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        
        for (int i =1; i<=str.length; i++){
            if (i%code == 0) {
                answer += str[i-1];
            }
        }
    
        return answer;
    }
}