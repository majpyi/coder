package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class N皇后51 {
	static HashSet<Integer> col ;
	static HashSet<Integer> pie ;
	static HashSet<Integer> na ;
	static List<List<Integer>> ree ;

	public static List<List<String>> solveNQueens(int n) {
		ree = new ArrayList<>();
		col = new HashSet<>();
		pie = new HashSet<>();
		na = new HashSet<>();
		if (n < 1) {
			return new ArrayList<>();
		}
		DFS(n, 0, new ArrayList<>());
		if( ree.size() > 0) {
			return generate_result(n);
		}else {
			return new ArrayList<>();
		}
	}

	private static List<List<String>> generate_result(int n) {
		List<List<String>> re =  new ArrayList<>();
		for(List<Integer> x : ree){
			List<String> r = new ArrayList<>();
			for(int i :x){
				StringBuilder sb = new StringBuilder();
				for(int p=0;p<n;p++){
//					st.setCharAt(i,'Q');
					if(i==p){
						sb.append('Q');
					} else{
						sb.append('.');
					}
				}
				r.add(sb.toString());
			}
			re.add(r);
		}
		return re;
	}

	private static void DFS(int n, int row, List<Integer> re) {
		if (row >= n) {
			ree.add(new ArrayList<>(re));
//			System.out.println(re);
		}

		for (int c = 0; c < n; c++) {
			if (col.contains(c) || pie.contains(c + row) || na.contains(row - c)) {
				continue;
			}

			col.add(c);
			pie.add(c+row);
			na.add(row-c);

			re.add(c);

			DFS(n,row+1,re);

			re.remove(re.size()-1);

			col.remove(c);
			pie.remove(c+row);
			na.remove(row-c);
		}

	}


	public static void main(String[] args) {
		System.out.println(solveNQueens(1));
		System.out.println(solveNQueens(2));
//		solveNQueens(1);
//		solveNQueens(2);
	}


//	//  错误的方法
//	public static List<List<String>> solveNQueens(int n) {
//		List<List<String>> re = new ArrayList<>();
//
//		for (int h = 0; h < n; h++) {
//			int[][] chess = new int[n][n];
//			int num = 1;
//			for (int k = 0; k < n; k++) {
//				chess[0][k] = -1;
//			}
//			chess[0][h] = 1;
//			for (int k = 1; k < n; k++) {
//				chess[k][h] = -1;
//			}
//
//			for (int i = 1; i < n; i++) {
//				for (int j = 0; j < n; j++) {          //   循环到这里的时候,第一个找到的肯定是第一个位置,而第一个位置一旦选取了,这一行就不会再寻找了
//					if (chess[i][j] == 0) {
//
//						for (int k = 0; k < n; k++) {
//							chess[i][k] = -1;
//						}
//						for (int k = i + 1; k < n; k++) {
//							chess[k][j] = -1;
//						}
//
//						num++;
//						chess[i][j] = 1;
//
//						for (int x = i + 1; x < n; x++) {
//							for (int y = 0; y < n; y++) {
//								if (x + y == i + j) {
//									chess[x][y] = -1;
//								}
//								if ((x - y + n) % n == (i - j + n) % n) {
//									chess[x][y] = -1;
//								}
//							}
//						}
////						break;
//					}
//				}
//			}
//			if (num == n) {
//				System.out.println(1);
//				ArrayList x = new ArrayList<String>();
//				for (int m = 0; m < n; m++) {
//					x.add(Arrays.toString(chess[m]));
//				}
//				re.add(x);
//			}
//		}
//		System.out.println(re);
//		return re;
//	}
//
//
//	public static void main(String[] args) {
////		for (int i = 0; i < 10; i++) {
////			System.out.println(1);
////			for (int j = 0; j < 10; j++) {
////				System.out.println(j);
////				break;
////			}
////		}
////		int[][] a ={{12,3},{2,3}};
////		System.out.println(Arrays.toString(a));
//		solveNQueens(4);
//
//	}


}