import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> integerList = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            if (integerList.isEmpty()){
                integerList.add(arr[i]);
                i++;
            } else if (arr[i] > integerList.get(integerList.size()-1)) {
                integerList.add(arr[i]);
                i++;
            } else if (arr[i] <= integerList.get(integerList.size()-1)) {
                integerList.remove(integerList.size()-1);
            }
        }

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}