class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temA = A;        //  문자열 A 의 substring 용 임시 문자열

        for (int i = 0; i < A.length(); i++) {
            if (temA.equals(B)) {       //  밀어낸 문자열이 B와 같으면 answer 를 반환하고 함수 종료
                return answer;
            }
            String pushed = temA.substring(A.length()-1);   //  문자열 A 에서 잘라낸 가장 마지막 문자열
            temA = pushed + temA.substring(0, A.length()-1);                    //  잘라낸 마지막 문자열을 앞쪽에 더해 temA 에 다시 저장
            answer++;                                                                                       //  뒤로 밀어낸 횟수를 answer 에 저장 
        }

        return -1;  
    }
}