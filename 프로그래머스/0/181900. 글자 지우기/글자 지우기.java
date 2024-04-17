import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        int[] sort = Arrays.stream(indices).sorted().toArray();
        int index = 0;

        for (int i = 0; i < indices.length; i++) {
            int tem = sort[i] - index;
            answer = answer.deleteCharAt(tem);
            index++;
        }

        return String.valueOf(answer);
    }
}