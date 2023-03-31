class Solution {
    public int solution(int n) {
        int answer = 0;
        int tem = 1;

        for (int i=1; i<=10; i++) {
            tem *= i;
            if (tem == n) {
                answer = i;
                break;
            } else if (tem > n){
                answer = i-1;
                break;
            }
        }

        return answer;
    }
}