import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        float[] aveArr = new float[score.length];
        float ave = 0;

        for (int i = 0; i < score.length; i++) {
            int english = score[i][0];
            int math = score[i][1];

            ave = (float)(english + math) / 2;

            aveArr[i] = ave;
        }

        int[] answer = new int[score.length];

        System.out.println(Arrays.toString(aveArr));

        for(int j = 0; j < score.length; j++) {
            int order = 1;
            for(int k = 0; k < score.length; k++) {
                if(aveArr[j] < aveArr[k]) order++;
                answer[j] = order;
            }
        }
        return answer;
    }
}