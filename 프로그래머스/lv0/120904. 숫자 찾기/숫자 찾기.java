class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] str = (num+"").split("");

        for (int i=0; i<str.length; i++) {
            if(Integer.parseInt(str[i]) == k) {
                answer =i+1;
                break;
            } else {
                answer =-1;
            }
        }

        return answer;
    }
}