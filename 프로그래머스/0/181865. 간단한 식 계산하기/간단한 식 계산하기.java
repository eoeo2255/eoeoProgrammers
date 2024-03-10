class Solution {
    public int solution(String binomial) {
        String[] arr;
        binomial = binomial.replaceAll(" ", "");

        if (binomial.contains("+")){
            arr = binomial.split("\\+");
            return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        } else if (binomial.contains("-")){
            arr = binomial.split("-");
            return Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        } else {
            arr = binomial.split("\\*");
            return Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }
    }
}