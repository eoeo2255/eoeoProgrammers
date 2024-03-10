import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> tem = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (start != end+1){
                tem.add(arr[start]);
                start++;
            }
        }
        int[] answer = tem.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}