import java.util.Arrays;
class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        String[] strA = str.split("");
        int answer = 0;
        
        for(int i=0; i< str.length(); i++){
            answer += Integer.parseInt(strA[i]);
        }
        
        return answer;
    }
}