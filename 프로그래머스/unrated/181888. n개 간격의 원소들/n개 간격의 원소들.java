import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i%n==0){
                integerList.add(num_list[i]);
            }
        }

        int[] answer = integerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}