import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        int end = num_list[num_list.length-1];
        int endBack = num_list[num_list.length-2];

        IntStream.range(0, num_list.length).forEach(i -> answer[i] = num_list[i]);

        answer[answer.length-1] = end > endBack ? (end-endBack) : end*2;
        return answer;
    }
}