import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public int solution(int[] date1, int[] date2) throws ParseException {
        if (date1[0] < date2[0]){
            return 1;
        } else if (date1[0] == date2[0]){
            if (date1[1] < date2[1]){
                return 1;
            } else if (date1[1] == date2[1]) {
                if (date1[2] < date2[2]){
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }
}