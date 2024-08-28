import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 배열을 오름차순으로 정렬합니다.
        Arrays.sort(citations);
        
        int n = citations.length;
        int hIndex = 0;
        
        // 배열을 역순으로 탐색하며 H-Index를 계산합니다.
        for (int i = 0; i < n; i++) {
            // 현재 인용 횟수와 남은 논문 수를 비교합니다.
            int h = n - i; // 남은 논문의 수 (인덱스 i를 기준으로)
            if (citations[i] >= h) {
                hIndex = h;
                break;
            }
        }
        
        return hIndex;
    }
}