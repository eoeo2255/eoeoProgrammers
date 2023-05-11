class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;                               //  원래 수가 n이 될때까지 answer 에도 값을 계속 더해줘야됨
            while (answer%3 ==0 || String.valueOf(answer).contains("3")) {  //  answer 가 3의 배수거나 3을 포함하고 있을 경우
                answer++;                                   //  answer 에 1을 더함
            }
        }

        return answer;
    }
}