class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for(String ss1 : s1){
            for(String ss2 : s2){
                if(ss1.equals(ss2)){
                    count++;
                }
            }
        }
        
        return count;
    }
}