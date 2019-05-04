package leetcode;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-02-25 12:54
 * @Description: https://leetcode-cn.com/problems/4sum/submissions/
 **/
public class 四数之和18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
//        ArrayList<List<Integer>> re = new ArrayList<>();
        HashSet<List<Integer>> re1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int m = j + 1; m < nums.length; m++) {
                    for (int n = m + 1; n < nums.length; n++) {
                        if (nums[i] + nums[j] + nums[n] + nums[m] == target) {
//                            r.clear();    // [[0, 0, 2, -2], [0, 0, 2, -2], [0, 0, 2, -2]]
//  因为add的是一个对象,而你将这个对象清空了,最后相当于最后的一个数值存在了前面的三个位置,因为每次存储的结果都是r
                            ArrayList<Integer> r = new ArrayList<>();
                            r.add(nums[i]);
                            r.add(nums[j]);
                            r.add(nums[n]);
                            r.add(nums[m]);
                            r.sort(new Comparator<Integer>() {
                                @Override
                                public int compare(Integer o1, Integer o2) {
                                    return o1 - o2;
                                }
                            });
                            re1.add(r);
                        }
                    }
                }
            }
        }
//        System.out.println(re);
        return new ArrayList<>(re1);
    }

    public List<List> threeSum(int[] nums) {
        List<List> res=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len-2;i++)//第1个数
            for(int j=i+1;j<len-1;j++)//第2个数
                if(Arrays.binarySearch(nums,j+1,len, -nums[i]-nums[j])>j)//第3个数用二分来检索
                    if(res.size()>0) {//去重
                        boolean isBeing=false;
                        for(List<Integer> al:res){
                            if(al.get(0)==nums[i]&&al.get(1)==nums[j])
                                isBeing=true;//该数组已包含，不添加
                        }
                        if(!isBeing)
                            res.add(Arrays.asList(nums[i],nums[j],-(nums[i]+nums[j])));
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],-(nums[i]+nums[j])));
                    }

        return res;
    }


}
