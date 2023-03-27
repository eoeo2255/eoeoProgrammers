class Solution {
    public String solution(int age) {
        String temp = age+"";
        String[] tem = temp.split("");
        String answer = "";
        for (int i=0; i<tem.length; i++) {
            answer += (char)(Integer.parseInt(tem[i])+97);
        }

        return answer;
    }
}