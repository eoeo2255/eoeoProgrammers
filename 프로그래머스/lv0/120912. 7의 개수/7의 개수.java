class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)=='7') {
                answer++;
            }
        }
        return answer;
    }
}