class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[(end-start)+1];
        int count = 0;

        for (int i = start; i <= end; i++) {
            answer[count] = i;
            count++;
        }
        return answer;
    }
}