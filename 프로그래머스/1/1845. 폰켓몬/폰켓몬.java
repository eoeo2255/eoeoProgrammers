import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        List<Integer> types = new ArrayList<>();

        for (int num: nums) {
            if (!types.contains(num)){
                types.add(num);
            }
        }

        int answer = nums.length / 2;

        if (types.size() > answer){
            return answer;
        } else {
            return types.size();
        }
    }
}