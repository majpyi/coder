package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 12:18
 * @Description: https://leetcode-cn.com/problems/combinations/
 **/
public class T77组合 {
	List<List<Integer>> arrayLists;

	public List<List<Integer>> combine(int n, int k) {
		arrayLists = new ArrayList<>();
		dfs(n, k, 1, new ArrayList<>(), arrayLists);
		return arrayLists;
	}

	private void dfs(int n, int k, int start, ArrayList<Integer> arrayList, List<List<Integer>> arrayLists) {
		if(k==0){
			arrayLists.add(new ArrayList<>(arrayList));
		}else {
			for(int i=start;i<=n;i++){
				arrayList.add(i);
				dfs(n,k-1,i+1,arrayList,arrayLists);
				arrayList.remove(arrayList.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		T77组合 a =new T77组合();
		System.out.println(a.combine(3,2));
	}
}
