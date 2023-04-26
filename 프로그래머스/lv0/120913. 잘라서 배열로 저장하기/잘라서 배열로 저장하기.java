class Solution {
    public String[] solution(String my_str, int n) {
        int count = 0;

        if (my_str.length()%n != 0) {
            count = (my_str.length()/n) + 1;
        } else {
            count = my_str.length()/n;
        }

        String[] answer = new String[count];

        for (int i = 0; i < count-1; i++) {
            answer[i] = my_str.substring((n*i),(n*(i+1)));
        }
        answer[answer.length-1] = my_str.substring(n* (count-1));
        return answer;
    }
}