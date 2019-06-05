package 集合;

/**
 * @Author: Mr.M
 * @Date: 2019-03-12 16:02
 * @Description:
 **/
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
//		a.addFirst(1);						// 添加的是链表开始的最先插入的位置
//		a.addFirst(2);
//		a.addFirst(3);
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		Iterator b =a.iterator();
//		while(b.hasNext()){
//			System.out.println(b.next());
//		}
//		System.out.println(a.removeFirst()); // 移除的是链表末端,最后插入的位置
//		System.out.println(a.removeFirst());
//		System.out.println(a.removeFirst());
//		System.out.println(a.remove());

		System.out.println(-1>>1);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(-1>>>1);
		System.out.println(Integer.toBinaryString(-1>>>1));

	}
}


class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
		// 获取标准输入流
		// // PrintStream ps = System.out;
		// // OutputStream os = ps;
		// OutputStream os = System.out; // 多态
		// // 我能不能按照刚才使用标准输入流的方式一样把数据输出到控制台呢?
		// OutputStreamWriter osw = new OutputStreamWriter(os);
		// BufferedWriter bw = new BufferedWriter(osw);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
			System.out));

		bw.write("hello");
		bw.newLine();
		 bw.flush();
		bw.write("world");
		bw.newLine();
		// bw.flush();
		bw.write("java");
		bw.newLine();
//		bw.flush();

//		bw.close();
	}
}