package 集合;

import java.io.*;

/**
 * @Author: Mr.M
 * @Date: 2019-03-12 20:44
 * @Description:
 **/
public class IO {
	public static void main(String[] args) throws Exception {
//		A();
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
			"osw2.txt"));
		 osw.write('a');
		 osw.write(97);
//		 osw.flush();
		osw.close();
		// 写数据
		// public void write(int c):写一个字符
		// osw.write('a');
		// osw.write(97);
		// 为什么数据没有进去呢?
		// 原因是：字符=2字节

	}

	private static void A() throws IOException {
		//		try (PrintWriter pw = new PrintWriter(new FileWriter("aa.txt"))) {
//			pw.println(123);
//			pw.println(456);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		BufferedOutputStream bufferedWriter =new BufferedOutputStream(new FileOutputStream("aabb.txt"));
		SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileInputStream("aa.txt"),
			new FileInputStream("aa.txt"));
//		SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileReader("aa.txt"),
//			new FileReader("aa.txt"));
//		System.out.println((char)sequenceInputStream.read());
//		System.out.println((char)sequenceInputStream.read());
		byte[] buf = new byte[1024];
		int length = 0 ;
		while((length = sequenceInputStream.read(buf))!=-1){
			bufferedWriter.write(buf,0,length);
		}
		//关闭资源
		sequenceInputStream.close();
		bufferedWriter.close();
	}
}
