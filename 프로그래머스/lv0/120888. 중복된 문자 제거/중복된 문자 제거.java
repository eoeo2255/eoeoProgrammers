class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] tem = my_string.toCharArray();

        for (int i=0; i<tem.length; i++) {
            if (!answer.contains(String.valueOf(tem[i]))) {
                answer+=tem[i];
            }
        }
        return answer;
    }
}