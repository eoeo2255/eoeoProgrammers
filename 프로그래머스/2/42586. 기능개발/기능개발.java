
import java.util.*;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
}

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = IntStream
                .range(0, progresses.length)
                .mapToObj(i -> (int) Math.ceil((100.0 - progresses[i]) / speeds[i]))
                .collect(Collectors.toCollection(LinkedList::new));

        List<Integer> result = new ArrayList<>();       //  배포한 개수를 담을 리스트 (몇개가 담길지 모름, 추후 배열로 변환)

        while (!queue.isEmpty()) {                  //  큐가 비어 있지 않다면
            int count = 1;                          //  일단 큐에서 첫번째 값을 꺼내고 시작하기 때문에 count는 0이 아니라 1
            int remains = queue.poll();

            while (!queue.isEmpty() && remains >= queue.peek()) {   //  큐에서 첫번째로 꺼낸 값이 다음 프로세스의 값보다 크면 꺼낼 수 있음
                queue.poll();
                count++;                              //  꺼냈으면 당일 배포할 수 있는 프로세스의 개수를 더함
            }

            result.add(count);                        //  꺼낼 수 있는 프로세스를 다 꺼냈으면 두번째 while 문 종료, 리스트에 당일 배포 개수 추가
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}