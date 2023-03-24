class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")) {
            for (int i=0; i<numbers.length-1; i++) {
                answer[1+i] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];

        } else {
            for (int i=0; i<numbers.length-1; i++) {
                answer[i] = numbers[1+i];
            }
            answer[numbers.length-1] = numbers[0];
        }

        return answer;
    }
}