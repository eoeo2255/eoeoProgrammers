import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (num>k){
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}