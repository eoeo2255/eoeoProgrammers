import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] clone = new int[emergency.length];
        int length = emergency.length;

        for (int i = 0; i < emergency.length; i++) {
            clone[i] = emergency[i];
        }

        Arrays.sort(clone);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (clone[i] == emergency[j]) {
                    answer[j] = length;
                    length--;
                    break;
                }
            }
        }
        return answer;
    }
}