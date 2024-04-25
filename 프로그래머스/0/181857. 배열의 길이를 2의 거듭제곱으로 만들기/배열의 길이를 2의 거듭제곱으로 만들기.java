class Solution {
    public int[] solution(int[] arr) {
        int index = 1;
        while (arr.length > index){
            index *= 2;
        }
        int[] answer = new int[index];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}