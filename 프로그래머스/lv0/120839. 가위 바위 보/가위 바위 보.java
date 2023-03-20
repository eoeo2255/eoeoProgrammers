class Solution {
    public String solution(String rsp) {
        String answer = "";
        char tem = ' ';
        
        for (int i=0; i<rsp.length(); i++){
            tem = rsp.charAt(i);
            
            switch (tem){
            case '0':
                    answer += "5";
                    continue;
            case '2':
                    answer +="0";
                    continue;
            case '5':
                    answer +="2";
                    continue;
            }
        }
        return answer;
    }
}