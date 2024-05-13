import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];


        switch (n) {
            case 1 -> answer = Arrays.copyOfRange(num_list, 0, b + 1);
            case 2 -> answer = Arrays.copyOfRange(num_list, a, num_list.length);
            case 3 -> answer = Arrays.copyOfRange(num_list, a, b + 1);
            default -> {
                int[] tem = Arrays.copyOfRange(num_list, a, b + 1);
                if (tem.length % c == 0) {
                    answer = new int[tem.length / c];
                } else {
                    answer = new int[(tem.length / c) + 1];
                }
                int count = 0;
                for (int i = 0; i < answer.length; i++) {
                    answer[i] = tem[count];
                    count += c;
                }
            }
        }
        return answer;
    }
}