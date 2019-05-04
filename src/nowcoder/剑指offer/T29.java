package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 18:57
 * @Description: 最小的K个数
 **/
public class T29 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

		if(k>input.length || k<=0){         //   一定要注意极限条件的判断
			return new ArrayList<>();
		}

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, (a, b) -> b - a);
		for(int i=0;i<k;i++){
			priorityQueue.add(input[i]);
		}

		if(input.length>k){
			priorityQueue.add(input[k]);
			for(int i=k+1;i<input.length;i++){
				priorityQueue.add(input[i]);
				priorityQueue.poll();
			}
			priorityQueue.poll();
		}

		ArrayList<Integer> re = new ArrayList<>(priorityQueue);
		Collections.sort(re) ;
		return re;
	}


	public static void main(String[] args) {
		System.out.println(GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},8));
	}
}
