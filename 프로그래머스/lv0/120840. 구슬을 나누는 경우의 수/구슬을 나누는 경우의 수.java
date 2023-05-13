import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger bigNum = BigInteger.ONE;

        for (int i = balls; i > share ; i--) {
            bigNum = bigNum.multiply(BigInteger.valueOf(i));
        }
        for (int i = 2; i <= balls-share; i++) {
            bigNum = bigNum.divide(BigInteger.valueOf(i));
        }

        return bigNum.intValue();
    }
}