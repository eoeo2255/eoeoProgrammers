class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int tem = 0;
        for (int i=0; i<sides.length; i++){
            if(sides[i]>answer){
                answer = sides[i];
            }
            tem += sides[i];
        }
        if (tem-answer <=answer){
            answer =2;
        } else{answer =1;}
            
        return answer;
    }
}