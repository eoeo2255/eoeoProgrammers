class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean front = true;
        boolean back = true;

        if (!x1) {
            if (!x2){
                front = false;
            }
        }
        if (!x3) {
            if (!x4){
                back = false;
            }
        }
        if (front){
            if (back){
                return true;
            }
        }

        return false;
    }
}