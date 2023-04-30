class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int one = sides[0];
        int two = sides[1];
        
        for (int i = 1; i < one+two; i++) {
            answer++;
        }
        
        if (one >= two) {
            answer -= one;
            for (int i = (one-two)+1; i <= one; i++) {
                answer++;
            }
        } else {
            answer -= two;
            for (int i = (two-one)+1; i <= two; i++) {
                answer++;
            }
        }
        return answer;
    }
}