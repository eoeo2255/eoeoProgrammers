import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0)          //  n을 뺀 값이 음수일 경우, 0.5를 더해 절대값이 같은 양수와의 차이를 둔다.
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            else                                    //  n을 뺀 값이 양수일 경우
                order[i] = numlist[i] - n;
        }

        Arrays.sort(order); // 오름차순 정렬

        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0) answer[i] = n - (int)order[i];        //  값을 1로 나누었을 때, 나누어 떨어지지 않으면 음수였기 때문에 n 에서 빼준다.
            else answer[i] = (int)order[i] + n;                                 //  원래의 수를 반환해야 하기 때문에 정렬된 상태에서 각각의 값에 n을 더하거나 빼준다.
        }
        return answer;
    }
}