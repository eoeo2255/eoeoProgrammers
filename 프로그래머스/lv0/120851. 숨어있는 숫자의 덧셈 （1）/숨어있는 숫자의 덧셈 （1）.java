class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String tem = my_string.replaceAll("[^0-9]","");
        
        String[] str = tem.split("");
        
        for(int i=0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}