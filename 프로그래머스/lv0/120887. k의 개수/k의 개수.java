class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int n=i; n<=j; n++) {
            sb.append(n);
        }

        for (int n =0; n<sb.length(); n++) {
            if ((sb.charAt(n)-'0')==k) {
                answer++;
            }
        }
        return answer;
    }
}
