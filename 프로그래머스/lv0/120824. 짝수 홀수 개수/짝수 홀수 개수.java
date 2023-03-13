class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int jj = 0;
        int h = 0;
        for (int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0){
                jj++;
            } else {h++;}
        }
        answer[0] = jj;
        answer[1] = h;
        
        return answer;
    }
}