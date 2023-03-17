class Solution {
    public String solution(String my_string) {
        char[] temp = my_string.toCharArray();
        char[] reverse = new char[temp.length];
        
        for (int i=0; i<=reverse.length-1; i++){
            reverse[reverse.length-1-i] = temp[i];
        }
        String answer = new String(reverse);
        return answer;
    }
}