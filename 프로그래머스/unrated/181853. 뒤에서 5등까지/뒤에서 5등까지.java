import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int limit = 5;

        int[] answer = new int[limit];
        for (int i = 0; i < limit; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}