class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] tem = new int[n];
        int[] back = new int[num_list.length - n];
        int backN = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i < n) {
                tem[i] = num_list[i];
            } else {
                back[backN] = num_list[i];
                backN++;
            }
        }
        
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int num : back) {
            answer[index++] = num;
        }

        for (int num : tem) {
            answer[index++] = num;
        }
        return answer;
    }
}