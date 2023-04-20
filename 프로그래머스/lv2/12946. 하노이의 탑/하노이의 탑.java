import java.util.*;
class Solution {
    public int[][] solution(int n) {
        return new Hanoi(1,3,n).toArray();
    }
}
class Hanoi {
    private final List<int[]> routes = new ArrayList<>();
    // 원판을 옮기면서 경로가 From과 To 경로가 어떻게 바뀔지 알 수 없기 때문에 List 자료형 사용, {n,m} 리스트

    public Hanoi(int from, int to, int n) {
        calculate(from, to, n);
    }

    private void calculate(int from, int to, int n) {
        if(n==1) {
            addRoute(from, to);
            return;
        }

        int empty = 6 - (from+to);

        calculate(from, empty, n-1);
        calculate(from, to, 1);
        calculate(empty, to, n-1);
    }

    private void addRoute(int from, int to) {
        routes.add(new int[]{from, to});
    }

    public int[][] toArray() {
        return routes
                .stream()
                .toArray(int[][]::new);
    } // List 형태의 routes 를 이차원 배열로 바꿔서, 요구한 정답 형태로 return

}