import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i%k ==0){
                numList.add(i);
            }
        }

        int[] answer = numList.stream().mapToInt(i->i).sorted().toArray();

        return answer;
    }
}