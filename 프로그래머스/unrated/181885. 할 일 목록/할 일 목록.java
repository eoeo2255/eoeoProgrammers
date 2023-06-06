import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> temList = new ArrayList<>();

        for(int i = 0; i<todo_list.length;i++){
            if(finished[i]==false){
                temList.add(todo_list[i]);
            }
        }

        String[] answer = temList.toArray(new String[temList.size()]);

        return answer;
    }
}