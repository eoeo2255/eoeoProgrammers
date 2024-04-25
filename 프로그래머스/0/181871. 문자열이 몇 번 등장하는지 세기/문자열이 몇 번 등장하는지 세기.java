class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = pat.length();

        for (int i = 0; i <= myString.length()-index; i++) {
            if (myString.substring(i,i+index).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}