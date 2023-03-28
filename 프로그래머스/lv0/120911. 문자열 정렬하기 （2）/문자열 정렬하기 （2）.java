import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] cArray = (my_string.toLowerCase()).toCharArray();
        Arrays.sort(cArray);
        for (int i = 0; i < cArray.length; i++) {
            answer.append(cArray[i]);
        }
        return answer.toString();
    }
}