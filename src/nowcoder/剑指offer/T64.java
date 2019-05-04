package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 11:49
 * @Description: 滑动窗口的最大值
 **/
public class T64 {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> re =new ArrayList<>();
		if(size>num.length || size<=0){
			return re;
		}
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(size,(a, b) -> b - a);
		for (int i=0;i<size;i++){
			priorityQueue.add(num[i]);
		}
		re.add(priorityQueue.peek());
		for (int i=size;i<num.length;i++){
			priorityQueue.remove(num[i-size]);
			priorityQueue.add(num[i]);
			re.add(priorityQueue.peek());
		}
		return re;
	}
}
