import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                index.add(i);
            }
        }

        int[] answer;
        if (index.size() >= 2) {
            int s = index.get(0);
            int e = index.get(index.size()-1);
            answer = Arrays.copyOfRange(arr, s, e+1);
        } else if (index.size() == 1) {
            answer = new int[]{arr[index.get(0)]};
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}