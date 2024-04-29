class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length(); i >= 0 ; i--) {
            String parts = myString.substring(0, i);
            if (parts.endsWith(pat)){
                answer = parts;
                break;
            }
        }
    
        return answer;
    }
}