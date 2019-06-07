package leetcode;

import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 17:25
 * @Description: https://leetcode-cn.com/problems/triangle/
 **/
public class T120三角形最小路径和 {
	public int minimumTotal(List<List<Integer>> triangle) {
//		int[][] re  = new int[][];
		for(int i=triangle.size()-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
			}
		}
		return triangle.get(0).get(0);
	}

}
