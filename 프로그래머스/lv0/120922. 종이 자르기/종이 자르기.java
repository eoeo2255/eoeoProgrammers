class Solution {
    public int solution(int M, int N) {
        if(M==1 && N==1) {
            return 0;
        }
        return (M*N)-1;
    }
}