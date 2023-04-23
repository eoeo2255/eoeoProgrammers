class Solution {
    public String solution(String bin1, String bin2) {
        int binary1 = Integer.parseInt(bin1, 2);    // String 을 2진수 int 로 형변환
        int binary2 = Integer.parseInt(bin2, 2);

        int sum = binary1 + binary2;    // 2진수의 덧셈

        return Integer.toString(sum,2); // 2진수를 String 으로 형변환
    }
}