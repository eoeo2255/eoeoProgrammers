import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> length = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (length.containsKey(strArr[i].length())){
                int num = length.get(strArr[i].length());
                length.put(strArr[i].length(), num+1);
            } else {
                length.put(strArr[i].length(), 1);
            }
            if (answer <= length.get(strArr[i].length())){
                answer = length.get(strArr[i].length());
            }
        }
        return answer;
    }
}