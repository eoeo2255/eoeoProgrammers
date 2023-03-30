import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
       int answer = 0;
        String [] bb = before.split("");
        String [] aa = after.split("");

        Arrays.sort(bb);
        Arrays.sort(aa);

        String b = Arrays.stream(bb).collect(Collectors.joining());
        String a = Arrays.stream(aa).collect(Collectors.joining());

        if(b.equals(a)) {
            answer = 1;
        }
        return answer;
    }
}