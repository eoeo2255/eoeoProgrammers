class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", ",");
        myStr = myStr.replaceAll("b", ",");
        myStr = myStr.replaceAll("c", ",");
        String[] arr = myStr.split(",");

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")){
                index++;
            }
        }

        if (index == 0){
            return new String[]{"EMPTY"};
        }
        
        String[] answer = new String[index];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}