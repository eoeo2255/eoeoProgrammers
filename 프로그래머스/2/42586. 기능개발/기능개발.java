import java.util.*;

class Solution {
 
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> dayQ = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int tem = (100 - progresses[i]) % speeds[i];
            int day = tem == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i]+1;

            dayQ.add(day);
        }

        List<Integer> result = new ArrayList<>();

        while (!dayQ.isEmpty()){
            int q = dayQ.poll();
            int count = 1;
            while (!dayQ.isEmpty() && q >= dayQ.peek()){
                dayQ.poll();
                count++;
            }
            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}