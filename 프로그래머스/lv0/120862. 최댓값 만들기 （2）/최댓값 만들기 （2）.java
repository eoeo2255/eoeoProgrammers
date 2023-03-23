import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int m = 0;
        int p = 0;
        
        Arrays.sort(numbers);
        
        m = numbers[0]*numbers[1];
        p = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        if (m>p){
            return m;
        }
        
        return p;
    }
}