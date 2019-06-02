package lintcode;

import java.util.Arrays;

/**
 * @program: coder
 * @description:
 * @author: Majpyi
 * @create: 2019-06-02 11:41
 **/

public class T463整数排序 {
    public static void sortIntegers(int[] A) {
        // write your code here
        Arrays.sort(A);
    }

    public static void main(String[] args) {
        int[]  a = new int[]{3,2,1};
        sortIntegers(a);
        System.out.println(Arrays.toString(a));
    }
}
