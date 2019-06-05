package 笔试.vivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-06-04 19:07
 * @Description:
 **/
public class vivo {
	public static void main(String[] args) {
		so(new int[]{1,2,3,5,3,6,8,1},new int[]{2,3,4});

	}

	private static void so(int[] a,int[] b){
//		HashMap<Integer,Integer> hashMap = new HashMap<>();
		HashMap<Integer,Integer> hashMap1 = new HashMap<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
//		for (int x: a){
//			hashMap.put(x,x);
//		}
		for (int x: b){
			hashMap1.put(x,x);
		}
		for(int i: a){
			if(!hashMap1.containsKey(i)){
				arrayList.add(i);
			}
		}
//		arrayList.size()
		System.out.println(arrayList);
	}


}
