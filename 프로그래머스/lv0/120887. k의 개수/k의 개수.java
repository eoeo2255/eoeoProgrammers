class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";

        for (int n=i; n<=j; n++) {
            str += n+"";
        }

        String[] tem = str.split("");
        String k2 = k + "";

        for (int n =0; n<tem.length; n++) {
            if (tem[n].equals(k2)) {
                answer++;
            }
        }
        return answer;
    }
}