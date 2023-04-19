import java.util.*;
class Solution {
    public String solution(String s) {
       List<String> list = new ArrayList<>(List.of(s.split("")));
        List<String> onlyOne = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(Collections.frequency(list, String.valueOf(s.charAt(i)))==1) {         
                onlyOne.add(String.valueOf(s.charAt(i)));
            }
        }
        Collections.sort(onlyOne);                                                     

        StringBuilder sb = new StringBuilder();                                       
        for (String str: onlyOne) {
            sb.append(str);
        }

        return sb.toString();
    }
}