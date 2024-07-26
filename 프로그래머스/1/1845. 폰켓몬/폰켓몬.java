import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> types = new HashSet<>();

        for (int num: nums) {
            types.add(num);
        }

        int answer = nums.length / 2;

        if (types.size() > answer){
            return answer;
        } else {
            return types.size();
        }
    }
}