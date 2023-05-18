class Solution {
    public int solution(int n, String control) {
        String[] chars = control.split("");

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case "w" -> n += 1;
                case "s" -> n -= 1;
                case "d" -> n += 10;
                default -> n -= 10;
            }
        }

        return n;
    }
}