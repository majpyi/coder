package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-24 16:48
 * @Description: https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 **/


import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class KthLargest {
    static LinkedList<Integer> big;
    static int temp;
    static int n;
    static int l;

    public KthLargest(int k, int[] nums) {
        big = new LinkedList<>(); // 存放前k大的数字
        temp = Integer.MIN_VALUE;  // 上次的前k大的数
        n = 0;   // 设置全局的变量,使k的值可以传递给这个类中的其他函数
        l = 0;    // 此链表现在的长度
        Arrays.sort(nums);
        if (nums.length > k) {
            temp = nums[nums.length - k];
            for (int i = 0; i < k; i++) {
                big.add(nums[nums.length - k + i]);
            }
            n = k;
            l = k;
        } else {
            if (nums.length > 0) {
                temp = nums[0];
            }
            for (int i = 0; i < nums.length; i++) {
                big.add(nums[i]);
            }
            n = k;
            l = nums.length;
        }

    }

    public static int add(int val) {
        if (val > temp || n > l) {
            if (big.size() == 0) {
                big.addLast(val);
            } else {
                for (int i = 0; i < Math.min(n, l); i++) {
                    if (val > big.get(l - 1 - i)) {
                        if (i == 0) {
                            big.addLast(val);
                            break;    // 一定要跳出循环不然还是会再次添加一遍,造成一个大数添加了多次
                        } else {
                            big.add(l - i, val);
                            break;
                        }
                    }
                }
                if (big.size() == l && l < n) {
                    big.addFirst(val);
                }

            }
            l++;   //  因为添加了一个元素,所以现在的链表的长度增加了一个
            temp = big.get(l - n);
            System.out.println(temp);
            return temp;
        } else {
            System.out.println(temp);
            return temp;
        }

    }


    public static void main(String[] args) {
        int k = 1;
        int[] arr = {-100};
        KthLargest kthLargest = new KthLargest(k, arr);
        kthLargest.add(-1);   // returns 4
        kthLargest.add(1);   // returns 5
        kthLargest.add(-2);  // returns 5
        kthLargest.add(-4);   // returns 8
        kthLargest.add(3);   // returns 8
    }
}

class KthLargest1 {
    PriorityQueue<Integer> q;
    int k;

    public KthLargest1(int k, int[] nums) {
        q = new PriorityQueue<>(k, idComparator);
        this.k = k;
        for (int x : nums) {
//            q.add(x);    错误
            add(x);
        }
    }

    public int add(int val) {
        if (q.size() < k) {
            q.offer(val);
//        } else if (q.peek() < val) {
        } else if (q.peek() > val) {
            q.poll();
            q.offer(val);
        }
        System.out.println(q.peek());
        return q.peek();
    }

    public static Comparator<Integer> idComparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer c1, Integer c2) {
            return c2 - c1;
        }
    };

    public static void main(String[] args) {
        int k = 1;
        int[] arr = {-100};
        KthLargest1 kthLargest = new KthLargest1(k, arr);
        kthLargest.add(-1);   // returns 4
        kthLargest.add(1);   // returns 5
        kthLargest.add(-2);  // returns 5
        kthLargest.add(-4);   // returns 8
        kthLargest.add(3);   // returns 8
    }


}





/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
