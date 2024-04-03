class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean value : included) {
            if (value) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}