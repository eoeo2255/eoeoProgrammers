class Solution {
    public int solution(int a, int b) {
        String strAB = (a+"")+(b+"");
        String strBA = (b+"")+(a+"");

        int ab = Integer.parseInt(strAB);
        int ba = Integer.parseInt(strBA);

        if (ab == ba) {
            return ab;
        }
        return Math.max(ab, ba);
    }
}