package IO_;

import java.io.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 11:41
 * @Description:
 **/
public class IODemo {
	public static void main(String[] args) throws Exception {
//		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("aa.txt")));
//		System.out.println(in.readLine());
//		in.close();
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aa.txt",true)));
//		out.write("kkkkkk");
//		out.flush();
//		out.close();


		BufferedReader in = new BufferedReader(new FileReader("aa.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("bb.txt"));
		while (in.readLine()!=null){

		}


	}
}
