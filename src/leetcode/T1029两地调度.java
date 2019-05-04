package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-25 10:56
 * @Description:
 **/
public class T1029两地调度 {
	public static int twoCitySchedCost(int[][] costs) {
		//让其以costs[0]-costs[1]的差值从小到大排序。
		Arrays.sort(costs, (a, b) -> {
			return (a[0] - a[1]) - (b[0] - b[1]);
		});
//		System.out.println(Arrays.toString(costs));
		//前一半取去A市，后一半取去B市，前一半是去A市最合适，
		//后一半市去B市最合适。
		int sum = 0;
		for (int i = 0; i < costs.length; ++i) {
			if (i < costs.length / 2) {
				sum += costs[i][0];
			} else {
				sum += costs[i][1];
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}});
	}
}
