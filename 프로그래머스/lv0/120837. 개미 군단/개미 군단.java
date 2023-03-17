class Solution {
    public int solution(int hp) {
        int answer = 0;
        int hp2 =0;
        int hp3 =0;
        
        hp2 = hp%5;
        answer = hp/5;
        hp3 = hp2%3;
        answer += hp2/3;
        answer += hp3;
        
        return answer;
    }
}