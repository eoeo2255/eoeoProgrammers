class Solution{

    public int solution(int[] numbers, int target) {
        return new NumberOfCases(numbers, target).calc();
    }
}

class NumberOfCases {
    private final int[] numbers;
    private final int target;

    public NumberOfCases(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    int calc() {
        return calc(0, 0);
    }

    private int calc(int depth, int sum) {
        //  마지막까지 갔을 때, sum 값이 target 과 같으면 1 반환
        if (depth == numbers.length) return sum == target ? 1 : 0;

        // 그렇지 않으면 계속 탐색
        return calc(depth + 1, sum + numbers[depth])        //  + 값
                + calc(depth + 1, sum - numbers[depth]);        //  - 값
    }


}