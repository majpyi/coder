package lintcode;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-06-05 08:52
 * @Description:
 **/
public class T1668区间最小覆盖 {
	public static int getAns(List<Interval> a) {
		// write your code here
		Collections.sort(a, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		int start = Integer.MAX_VALUE;
		int end = Integer.MIN_VALUE;

		for (Interval x : a) {
			start = Math.min(start, x.start);
			end = Math.max(end, x.end);
		}
//		System.out.println(start);
//		System.out.println(end);

		int[] tag = new int[end - start + 1];
		for (Interval x : a) {
			for (int i = x.start; i <= x.end; i++) {
				tag[i - start]++;
			}
		}
//		System.out.println(Arrays.toString(tag));

		int stop = Arrays.stream(tag).max().getAsInt();
		int re = 0;
		while (stop != 0) {
//			int index =  Arrays.binarySearch(tag,stop);
			int index = 0;
			for (int i = 0; i < tag.length; i++) {
				if (tag[i] == stop) {
					index = i;
					break;
				}
			}
			System.out.println(Arrays.toString(tag));

//			System.out.println(index);
//			System.out.println(stop);
			ArrayList<Interval> r = new ArrayList<>();
			for (Interval x : a) {
				if (x.start <= (index + start) && x.end >= (index + start)) {
					for (int i = x.start; i <= x.end; i++) {
						tag[i - start]--;
					}
					r.add(x);
				}
			}

			for (Interval x : r) {
				a.remove(x);
			}

			stop = Arrays.stream(tag).max().getAsInt();
			re++;

//			System.out.println(Arrays.toString(tag));
		}


//		System.out.println(a);
//		int sum = a.size();
//		int end = a.get(0).end;
//		int start = a.get(0).end;
//		for (int i = 1; i < a.size(); i++) {
//			if (a.get(i).start <= end && a.get(i).start<=start) {
//				sum -= 1;
//				end = Math.max(end, a.get(i).end);
//				start = Math.max(start, a.get(i).start);
//			}
//		}
//		return sum;


		return re;
	}


	public static int getAns1(List<Interval> a) {
		Collections.sort(a, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

		int ans = 1;
		Interval temp = a.get(0);

		for (int i = 1; i < a.size(); i++) {
			if (temp.end < a.get(i).start) {
				temp = a.get(i);
				ans++;
				continue;
			}
//			temp.start = a.get(i).start;
			temp.end = Math.min(temp.end, a.get(i).end);
		}
		return ans;
	}


	public static void main(String[] args) {
		String a = "[(27,74),(25,65),(8,36),(21,63),(18,20),(35,51),(55,86),(49,69),(79,89)]";
//		String a = "[(1,5),(5,6),(6,7),(8,9)]";
//		String a = "[(1,5),(5,6)]";
		String b1 = a.replaceAll("\\(", "");
		String b2 = b1.replaceAll("\\)", "");
		String b3 = b2.replaceAll("\\[", "");
		String b4 = b3.replaceAll("\\]", "");
		String[] re = b4.split(",");
		ArrayList rr = new ArrayList();
		for (int i = 0; i < re.length; i += 2) {
			rr.add(new Interval(Integer.valueOf(re[i]), Integer.valueOf(re[i + 1])));
		}
		System.out.println(getAns1(rr));
	}

}
