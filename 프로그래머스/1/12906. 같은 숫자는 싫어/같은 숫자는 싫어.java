import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != list.get(count)){
                list.add(arr[i]);
                count++;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}   