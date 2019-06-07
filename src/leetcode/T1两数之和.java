package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Mr.M
 * @Date: 2019-02-25 12:49
 * @Description: https://leetcode-cn.com/problems/two-sum/solution/
 **/
public class T1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] re =new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    re[0]=i;
                    re[1]=j;
                }
            }
        }
        return re;
    }



    public int[] twoSum2(int[] nums, int target) {
        int[] re = new int[2];
        int tag =-1;
        int temp = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                tag =hm.get(nums[i]);
                temp = nums[i];
            }
            hm.put(nums[i],i);
        }

        Arrays.sort(nums);
        int k = nums.length - 1;
        for (int i = 0; i < k; i++) {
            if (nums[i] + nums[k] > target) {
                k--;
                i = -1;  //  在进入for循环之后i才变成了0开始
            } else if (nums[i] + nums[k] == target) {
                re[0] = hm.get(nums[i]);
                re[1] = hm.get(nums[k]);
                if (tag!=-1 ){
                    if((nums[i]+temp) == target){
                        re[0] = tag;
                        System.out.println(1);
                    }
                }
                Arrays.sort(re);
//                System.out.println(tag);
                return re;
            }
        }
        return re;
    }
}
