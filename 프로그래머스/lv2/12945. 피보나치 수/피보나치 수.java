import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
class Solution {

    public int solution(int n) {
        BigInteger rs = new Fibonacci().calc(n);

        rs = rs.mod(BigInteger.valueOf(1234567));   //  BigInteger 의 나머지 연산자

        return rs.intValue();
    }
}


class Fibonacci {
    Map<Integer, BigInteger> cache = new HashMap<>();

    BigInteger calc(int n) {
        if (cache.containsKey(n)) return cache.get(n);  //  만약 cache 에 데이터가 있다면 계산하지 말고 cache 안의 데이터를 쓰기

        BigInteger rs;

        if (n <= 1) {
            rs = BigInteger.valueOf(n); //  n이 1이나 0일 경우 n을 반환
        } else {
            BigInteger calcOfNMinus2 = calc(n - 2);

            BigInteger calcOfNMinus1 = calc(n - 1);

            rs = calcOfNMinus2.add(calcOfNMinus1);  //  BigInteger 끼리의 덧셈은 add 를 사용한다.
        }
        cache.put(n, rs);

        return rs;

    }

}