import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length-1; i++) {
            String num = phone_book[i];
            String behind = phone_book[i+1];

            if (behind.startsWith(num)){
                return false;
            }
        }

        return true;
    }
}