class Solution {
    public int solution(int order) {
        int answer = 0;
        String tem = order + "";

        for (int i=0; i<tem.length(); i++) {
            if(tem.charAt(i)=='3' || tem.charAt(i) =='6' || tem.charAt(i) =='9') {
                answer++;
            }
        }
        return answer;
    }
}