class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i=4; i<=n; i++) {
            int tem = 0;

            for (int j= 1; j<=i; j++) {
                if (i%j ==0) {
                    tem++;
                }
            }
            if(tem>=3){
                answer++;
            }
        }
        return answer;
    }
}