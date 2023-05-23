class Solution {
    public int solution(String myString, String pat) {
        String[] tem = myString.split("");
        StringBuilder sb = new StringBuilder();

        for (String string : tem) {
            if (string.equals("A")) {
                string = "B";
            } else {
                string = "A";
            }
            sb.append(string);
        }

        String str = sb.toString();

        return str.contains(pat)? 1:0;
    }
}