package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 11:48
 * @Description: 数据流中的中位数
 **/
public class T63 {
	ArrayList<Integer> a = new ArrayList<>();

	public void Insert(Integer num) {
		a.add(num);
	}

	public Double GetMedian() {
		a.sort((a, b) -> a - b);
		if((count&1)==1){
//			return a.sort((a,b)-->a-b).;
			return Double.valueOf(a.get(a.size()/2));
		}else {
			return  (a.get(a.size()/2)+a.get(a.size()/2-1))/2.0;
		}
	}


	int count = 0;
	PriorityQueue<Integer> minHeap =new PriorityQueue<>();
	PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a,b) -> b-a);

	public void Insert1(Integer num) {
		count++;
		if((count&1)==1){
			maxHeap.add(num);
			minHeap.add(maxHeap.poll());
		}else {
			minHeap.add(num);
			maxHeap.add(minHeap.poll());
		}
	}

	public Double GetMedian1() {
//		if(minHeap.size()==0 || maxHeap.size()==0){
//			return null;
//		}
		if(count==0){
			return null;
		}
		if((count&1)==1){
			return Double.valueOf(minHeap.peek());
		}else {
			return  (maxHeap.peek()+minHeap.peek())/2.0;
		}
	}



}

