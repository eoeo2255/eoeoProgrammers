import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> tem = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(flag[i]){
                int count = arr[i]*2;
                for (int j = 0; j < count; j++) {
                    tem.add(arr[i]);
                }
            } else {
                int range = (tem.size() - arr[i]);
                tem.subList(range, tem.size()).clear();
            }
        }

        return  tem.stream().mapToInt(Integer::intValue).toArray();
    }
}