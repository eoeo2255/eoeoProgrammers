
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new Solution().solution(new int[]{1, 2, 3, 4, 5})
                )
        );
    }
}

 class Solution {

    public int[] solution(int[] answer) {
        int maxPoint = Stream.of(student1(answer), student2(answer), student3(answer))
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        return IntStream.rangeClosed(1, 3)                  // 점수가 가장 높은 학생의 번호를 배열에 담아 반환 (동일점수도 모두 반환)
                .filter(studentNo -> maxPoint == scoring(answer, studentNo))
                .toArray();
    }

    private int student1(int[] answer) {
        return scoring(answer, new int[]{1, 2, 3, 4, 5});
    }

    private int student2(int[] answer) {
        return scoring(answer, new int[]{2, 1, 2, 3, 2, 4, 2, 5});
    }

    private int student3(int[] answer) {
        return scoring(answer, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
    }

     private int scoring(int[] answers, int studentNo) {
         if (studentNo == 1) return student1(answers);
         if (studentNo == 2) return student2(answers);

         return student3(answers);
     }

    private int scoring(int[] answers, int[] submit) {      // 정답패턴 배열과 답안 배열을 비교해 맞은 개수를 반환
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == submit[i % submit.length]) {
                score++;
            }
        }
        return score;
    }
}