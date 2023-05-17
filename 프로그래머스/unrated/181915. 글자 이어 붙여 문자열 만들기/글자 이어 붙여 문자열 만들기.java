class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char[] chars = my_string.toCharArray();

        for (int i = 0; i < index_list.length; i++) {
            answer.append(chars[index_list[i]]);
        }

        return answer.toString();
    }
}