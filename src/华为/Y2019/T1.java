package 华为.Y2019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-03 18:27
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = Integer.valueOf(scanner.nextLine());
		String[] strings;
		ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
		ArrayList<String> arrayList1;
		ArrayList<Integer> re = new ArrayList<>();
		while (scanner.hasNext()) {
			arrayList1 = new ArrayList<>();
			strings = scanner.nextLine().split(",");
			for (String x : strings) {
				arrayList1.add(x);
			}
			arrayList.add(new ArrayList<>(arrayList1));
		}
		System.out.println(arrayList);
		int tag =-1;
		while(tag!=arrayList.size()){
			tag = 0;
			for (int i = 0; i < arrayList.size(); i++) {
				for (int j = 0; j < l; j++) {
					if (arrayList.get(i).isEmpty()) {
						tag ++;
						break;
					} else {
						re.add(Integer.valueOf(arrayList.get(i).remove(0)));
//						tag =0;
					}
				}
			}
		}
		System.out.println(re);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0;i<re.size()-1;i++){
			stringBuilder.append(re.get(i)+",");
		}
		stringBuilder.append(re.get(re.size()-1));
		System.out.println(stringBuilder.toString());
	}
}
