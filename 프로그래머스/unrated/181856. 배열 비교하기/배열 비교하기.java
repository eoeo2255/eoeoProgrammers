class Solution {
    public int solution(int[] arr1, int[] arr2) {
         int a1 = 0;
        int a2 = 0;

        if (arr1.length > arr2.length){
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                a1 +=arr1[i];
                a2 +=arr2[i];
            }
        }

        if (a1 > a2){
            return 1;
        } else if (a1 < a2) {
            return -1;
        } else {
            return 0;
        }
    }
}