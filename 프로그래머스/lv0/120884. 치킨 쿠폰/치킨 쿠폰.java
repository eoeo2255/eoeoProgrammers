class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken >= 10) {
            int service = chicken / 10;                     //  쿠폰으로 받은 서비스 치킨의 수
            int couponCount = chicken % 10;         //  서비스 치킨을 시켜먹고 남은 쿠폰의 개수

            chicken = service+couponCount;      //  남은쿠폰 + 서비스치킨주문시 받은 쿠폰 >= 10이면 서비스 치킨!

            answer += service;                              //  서비스로 받은 치킨의 수 추가
        }
        
        return answer;
    }
}