import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] before = new int[arr.length];

        while (!Arrays.equals(before, arr)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0){
                    before[i] = arr[i];
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    before[i] = arr[i];
                    arr[i] = (arr[i] * 2) + 1;
                } else {
                    before[i] = arr[i];
                }
            }
            answer++;
        }
        return answer-1;
    }
}