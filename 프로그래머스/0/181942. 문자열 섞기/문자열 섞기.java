class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder("");
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(arr1[i]);
            answer.append(arr2[i]);
        }

        return String.valueOf(answer);
    }
}