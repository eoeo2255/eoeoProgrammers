import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        return Arrays.stream(answer)
                        .filter(part -> !part.isEmpty())
                        .sorted()
                        .toArray(String[]::new);
    }
}