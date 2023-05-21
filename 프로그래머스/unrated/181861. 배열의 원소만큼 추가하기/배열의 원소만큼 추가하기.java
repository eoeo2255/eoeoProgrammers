import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> temAnswer = new ArrayList<>();

        for (int j : arr) {
            for (int i = 0; i < j; i++) {
                temAnswer.add(j);
            }
        }

        int[] answer = temAnswer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}