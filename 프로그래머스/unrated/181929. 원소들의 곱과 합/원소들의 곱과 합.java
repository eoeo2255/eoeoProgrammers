class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int plus = 0;

        for (int i = 0; i < num_list.length; i++) {
            answer *= num_list[i];
            plus += num_list[i];
        }

        return answer < Math.pow(plus, 2) ? 1:0;
    }
}