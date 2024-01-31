class Solution {
    public int solution(int a, int b) {
        String str = a+""+b;
        int attach = Integer.parseInt(str);
        int multiply = 2*a*b;

        if (attach >= multiply){
            return attach;
        } else {
            return multiply;
        }
    }
}