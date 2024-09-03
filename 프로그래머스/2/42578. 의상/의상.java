import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Object> cody = new HashMap<>();
        List<String> duplication = new ArrayList<>();

        for (String[] item: clothes) {
            String section = item[1];

            if (!duplication.contains(section)){
                duplication.add(section);
                cody.put(section, 1);
            } else {
                int count = (int) cody.get(section)+1;
                cody.put(section, count);
            }
        }

        int answer = 1;
        for (Map.Entry<String, Object> entry : cody.entrySet()) {
            answer *= ((int)entry.getValue() + 1);
        }
        return answer -1;
    }
}