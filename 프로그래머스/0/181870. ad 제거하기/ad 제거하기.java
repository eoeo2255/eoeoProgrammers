class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        for (int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                len--;
            }
        }
        String[] answer = new String[len];
        int count = 0;
        for (int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[count] = strArr[i];
                count++;
            }
        }
        return answer;
    }
}