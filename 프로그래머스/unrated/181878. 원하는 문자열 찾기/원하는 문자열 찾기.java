class Solution {
    public int solution(String myString, String pat) {
        String str1 =myString.toUpperCase();
        String str2 = pat.toUpperCase();
        return str1.contains(str2)? 1 : 0;
    }
}