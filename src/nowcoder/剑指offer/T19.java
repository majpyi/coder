package nowcoder.剑指offer;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 19:27
 * @Description: 顺时针打印矩阵
 **/
public class T19 {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> re = new ArrayList<>();
		int high_x = matrix.length - 1;
		int low_x = 0;
		int high_y = matrix[0].length - 1;
		int low_y = 0;

		while (low_x <= high_x && low_y <= high_y) {

			for (int i = low_y; i <= high_y; i++) {
				re.add(matrix[low_x][i]);
				System.out.print(matrix[low_x][i]);
			}
			low_x++;
			if(low_x > high_x){
				break;
			}


			for (int i = low_x; i <= high_x; i++) {
				re.add(matrix[i][high_y]);
				System.out.print(matrix[i][high_y]);
			}
			high_y--;
			if(low_y > high_y){
				break;
			}

			for (int i = high_y; i >= low_y; i--) {
				re.add(matrix[high_x][i]);
				System.out.print(matrix[high_x][i]);
			}
			high_x--;
			if(low_x > high_x){
				break;
			}

			for (int i = high_x; i >= low_x; i--) {
				re.add(matrix[i][low_y]);
				System.out.print(matrix[i][low_y]);
			}
			low_y++;
			if(low_y > high_y){
				break;
			}

		}
		return re;
	}

	public static void main(String[] args) {
		int[][] re = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		printMatrix(re);
	}
}
