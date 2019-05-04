package 刷题;

/**
 * @Author: Mr.M
 * @Date: 2019-04-10 18:59
 * @Description:
 **/
import java.io.*;
import java.util.*;

public class java快速输入 {

	static class FR {
		BufferedReader br;
		StringTokenizer tk;

		FR(InputStream stream) {
			br = new BufferedReader(new InputStreamReader(stream), 32768);
			tk = null;
		}

		String next() {
			while (tk == null || !tk.hasMoreElements()) {
				try {
					tk = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tk.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	static void solve(InputStream stream, PrintWriter out) {
		FR in = new FR(stream);

		//  start code.....

	}

	public static void main(String[] args) {
		OutputStream os = System.out;
		InputStream is = System.in;
		PrintWriter out = new PrintWriter(os);
		solve(is, out);
		out.close(); // 不关闭就没有输出
	}
}