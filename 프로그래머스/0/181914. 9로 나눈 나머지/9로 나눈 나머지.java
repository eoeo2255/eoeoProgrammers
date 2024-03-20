class Solution {
    public int solution(String number) {
        int answer = 0;
        char [] strs = number.toCharArray();

        for (int num : strs ) {
            answer += num - '0';
        }
        return answer%9;
    }
}