import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<String, String>();

        for (String[] strings : db) {
            dbMap.put(strings[0], strings[1]);
        }

        if (dbMap.containsKey(id_pw[0])) {                      //  dbMap 에 머쓱이의 id 와 같은 key 값이 있는지 확인
            if (dbMap.get(id_pw[0]).equals(id_pw[1])) {     //  같은 key 값이 있을 경우 해당 key 의 value 값을 반환 하고 , 그 값이 머쓱이의 pw 와 같은지 확인
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}