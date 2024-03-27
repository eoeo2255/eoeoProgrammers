import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int m, int c) {
       List<String> tem = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i+=m) {
            String parts = my_string.substring(i,i+m);
            tem.add(parts);
        }
        String answer = "";
        for (int i = 0; i < tem.size(); i++) {
            answer += tem.get(i).substring(c-1,c);
        }

        return answer.toString();
    }
}