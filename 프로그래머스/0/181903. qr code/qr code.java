class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        String[] arr = code.split("");

        for (int i = 0; i < arr.length; i++) {
            if (i % q == r){
                answer.append(arr[i]);
            }
        }
        
        return String.valueOf(answer);
    }
}