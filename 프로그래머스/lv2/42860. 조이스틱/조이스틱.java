import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int solution(String name) {
        return nameCount(name) + moveCount(name);
    }
    private int nameCount(String name) {
        int nameCount = 0;   // 문자 바꾸는데 필요한 횟수, 위/아래

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            int diff = Math.min(c-'A', 'Z' - c +1);     // 앞으로 갔을 때와 (전자 식), 뒤로 갔을 때의 (후자 식) 값을 비교해 방향 결정, 최소 횟수를 구해야 하기 때문에 Math.min 사용
            // Math.min()은 두 값이 같을 경우, 같은 값을 반환 (여기서는 정 가운데인 N(=13)의 값이 해당 됨)

            nameCount += diff;       // 총 nameCost 를 구하기 위해 더함
        }

        return nameCount;
    }

    public int moveCount(String name) {
        if (name.length() == 1) return 0;       //  name 의 길이가 1일 경우 moveCount 없음
        if (Ut.isAllA(name.substring(1), 'A')) return 0;        //  (처음 1개만 'A'가 아니거나) 모두 'A' 로만 이루어져 있을 경우 0을 반환

        return List.of(directionCheck(name), directionCheck2(name), directionCheck3(name), directionCheck4(name))
                .stream()
                .sorted()
                .findFirst()
                .orElse(0);
    }

    public int directionCheck(String name) {        // 앞으로만 이동했을 경우 이동 횟수
        int move = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                move = i;
            }
        }

        return move;
    }

    public int directionCheck2(String name) {       // 뒤로만 이동했을 경우 이동 횟수
        int move = 0;

        for (int i = name.length()-1; i >= 1; i--) {
            if (name.charAt(i) != 'A') {
                move = name.length() - i;
            }
        }
        return move;
    }


    public int directionCheck3(String name) {       // 뒤로 갔다가 다시 앞으로 이동했을 경우 이동 횟수
        Ut.longestContinuumLengthAndIndex indexNlength = Ut.getLongestContinuumLengthAndIndex(name,'A');

        if (indexNlength.index == -1) {         // 'A' 구간이 없음
            return directionCheck(name);       //  'A' 구간이 없을 경우 앞으로 가든, 뒤로 가든 상관 없기 때문에 directionCheck 함수 사용
        }

        int onlyBackCount = name.length() - (indexNlength.index + indexNlength.length);     // 뒤로 이동 했을 때, 마지막 ~ 'A' 구간이 나오기 전까지의 거리
        int movingBack = onlyBackCount * 2;     // 뒤로 이동 했을 때, 마지막 ~ 'A' 구간이 나오기 전까지의 거리를 '왕복'한 횟수 (왕복이기 때문에 '*2')

        int movingFront = indexNlength.index-1;          // 'A' 가 나오기 '전'까지의 거리를 구해야 하기 때문에 'A' 구간의 시작인덱스에서 '-1'을 해줘야 함

        return movingBack + movingFront;
    }

    public int directionCheck4(String name) {
        Ut.longestContinuumLengthAndIndex indexNlength = Ut.getLongestContinuumLengthAndIndex(name, 'A');

        if (indexNlength.index == -1) {
            return directionCheck(name);
        }

        int onlyFrontCount = indexNlength.index-1;
        int movingFront = onlyFrontCount * 2;

        int movingBack = name.length() - (indexNlength.index + indexNlength.length);

        return movingFront + movingBack;
    }
}
class Ut{       // 'A'가 연속하는 구간이 있을 경우, 해당 구간의 시작 인덱스번호와 길이를 반환 (feat. chatGPT)

    public static boolean isAllA(String str, char c) {      //  모두 'A' 로만 이루어져 있을 경우
        return str
                .chars()
                .allMatch(e -> c == e);
    }

    public static class longestContinuumLengthAndIndex {
        int index;
        int length;


        public longestContinuumLengthAndIndex(int index, int length) {
            this.index = index;
            this.length = length;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof longestContinuumLengthAndIndex)) return false;

            longestContinuumLengthAndIndex that = (longestContinuumLengthAndIndex) o;

            if (index != that.index) return false;
            return length == that.length;
        }

        @Override
        public String toString() {
            return "LongestCharContinuumIndexAndLength{" +
                    "index=" + index +
                    ", length=" + length +
                    '}';
        }
    }

        public static longestContinuumLengthAndIndex getLongestContinuumLengthAndIndex(String str, char c) {
            String regex = c + "+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            int maxLength = 0;
            int maxIndex = -1;

            while (matcher.find()) {
                int startIndex = matcher.start();
                int length = matcher.end() - startIndex;

                if (length > maxLength) {
                    maxLength = length;
                    maxIndex = startIndex;
                }
            }

            return new longestContinuumLengthAndIndex(maxIndex, maxLength);
        }
}