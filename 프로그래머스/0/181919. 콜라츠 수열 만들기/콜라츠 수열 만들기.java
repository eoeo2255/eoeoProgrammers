import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList =  new ArrayList<>(Arrays.asList(n));

        while (n != 1){
            if (n % 2 == 0){
                n = n/2;
                answerList.add(n);
            } else {
                n = 3 * n + 1;
                answerList.add(n);
            }
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}