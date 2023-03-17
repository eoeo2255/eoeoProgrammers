class Solution {
    public int solution(int n) {
        int answer = 0;
        double tem = 0;
        
        tem = Math.sqrt(n);
        
        if (tem % 1 == 0){
            answer = 1;
        }else {
            answer = 2;
        }
        
        return answer;
    }
}