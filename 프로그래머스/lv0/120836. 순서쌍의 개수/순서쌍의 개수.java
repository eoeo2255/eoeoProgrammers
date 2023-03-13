class Solution {
    public int solution(int n) {
        int tem = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0){
                tem++;
            }
        }
        return tem;
    }
}