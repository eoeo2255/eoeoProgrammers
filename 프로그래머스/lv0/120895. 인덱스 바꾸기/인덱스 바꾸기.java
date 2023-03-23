class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");
        String tem = "";
        
        tem = answer[num1];
        answer[num1] = answer[num2];
        answer[num2] = tem;
        
        return String.join("",answer);
    }
}