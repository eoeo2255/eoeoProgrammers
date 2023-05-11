import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> scoresMap = buildScoresMap(info);

        int[] answer = new int[query.length];

        for (int i = 0; i < answer.length; i++) {

            int lastSpaceIndex = query[i].lastIndexOf(" "); // query문 각각, 제일 마지막에 등장하는 공백의 인덱스

            String key = query[i].substring(0, lastSpaceIndex).replaceAll(" and ", " ");    //  query 문 내의 조건
            int count = Integer.parseInt(query[i].substring(lastSpaceIndex + 1));   //  마지막 공백 제외하고 그 이후부터의 값

            answer[i] = countBiggerThan(scoresMap.get(key), count);
        }
        return answer;
    }

    Map<String, List<Integer>> buildScoresMap(String[] info) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        for (String infoRow : info) {
            String[] infoRowBits = infoRow.split(" ");

            String languageTypeCode = infoRowBits[0];
            String jobGroupTypeCode = infoRowBits[1];
            String careerTypeCode = infoRowBits[2];
            String foodTypeCode = infoRowBits[3];
            int score = Integer.parseInt(infoRowBits[4]);

            String[] languageTypeCodes = new String[]{"-", languageTypeCode};
            String[] jobGroupTypeCodes = new String[]{"-", jobGroupTypeCode};
            String[] careerTypeCodes = new String[]{"-", careerTypeCode};
            String[] foodTypeCodes = new String[]{"-", foodTypeCode};

            for (String languageTypeCode_ : languageTypeCodes) {
                for (String jobGroupTypeCode_ : jobGroupTypeCodes) {
                    for (String careerTypeCode_ : careerTypeCodes) {
                        for (String foodTypeCode_ : foodTypeCodes) {
                            String key = languageTypeCode_ + " " + jobGroupTypeCode_ + " " + careerTypeCode_ + " " + foodTypeCode_;

                            scoresMap.putIfAbsent(key, new ArrayList<>()); // key가 없으면 새로운 ArrayList를 value로 넣어줌
                            scoresMap.get(key).add(score);                              //  value 값을 먼저 넣고 key 값을 넣음
                        }
                    }
                }
            }
        }

        // scoresMap 을 key 값 기준으로 정렬
        scoresMap.forEach((key, scores) -> scores.sort(Integer::compareTo));

        return scoresMap;
    }

    public int countBiggerThan(List<Integer> scores, int score) {
        if (scores == null) return 0;
        if (scores.isEmpty()) return 0;

        int left = 0;
        int right = scores.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // 중앙값

            if (scores.get(mid) < score) {
                left = mid + 1;             //  mid 값이 score 보다 작으면 좌측 포위망을 중앙값+1로  교체
            } else {
                right = mid - 1;            //  mid 값이 score 보다 크면 우측 포위망을 중앙값-1로  교체
            }
        }

        return scores.size() - left;        //  이전 scores.size() - i; 과 동일
    }

}