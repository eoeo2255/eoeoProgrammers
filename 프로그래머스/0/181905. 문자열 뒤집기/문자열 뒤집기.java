class Solution {
    public String solution(String my_string, int s, int e) {
        String ch = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(ch).reverse();

        return my_string.replace(ch,sb);
    }
}