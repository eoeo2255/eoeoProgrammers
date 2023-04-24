import java.util.Objects;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int backNum = 0;

        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(strArr[i], "Z")) {
                backNum += Integer.parseInt(strArr[i-1]);
            } else {
                answer += Integer.parseInt(strArr[i]);
            }
        }

        return answer-backNum;
    }
}