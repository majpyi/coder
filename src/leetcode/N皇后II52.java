package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class N皇后II52 {
	static HashSet<Integer> col ;
	static HashSet<Integer> pie ;
	static HashSet<Integer> na ;
	static List<List<Integer>> ree ;

	public int totalNQueens(int n) {
		ree = new ArrayList<>();
		col = new HashSet<>();
		pie = new HashSet<>();
		na = new HashSet<>();
		if (n < 1) {
			return 0;
		}
		DFS(n, 0, new ArrayList<>());
		return ree.size();
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





}