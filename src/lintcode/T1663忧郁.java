package lintcode;

import java.util.Arrays;

/**
 * @program: coder
 * @description:
 * @author: Majpyi
 * @create: 2019-06-02 12:11
 **/

public class T1663忧郁 {
    public String depress(int m, int k, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int sum = 0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=m){
            return "no";
        }
        return "yes";
    }
}
