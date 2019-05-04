package 网络编程;

import java.io.*;
import java.net.Socket;

/**
 * @Author: Mr.M
 * @Date: 2019-04-07 19:05
 * @Description:
 **/
public class ClinentSocketDemo {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		printWriter.write("hello");
		printWriter.flush();
		socket.shutdownOutput();

		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String info;
		while ((info=bufferedReader.readLine())!=null){
			System.out.println("cline  "+ info);
			info = bufferedReader.readLine();
		}


		printWriter.close();
		outputStream.close();
		socket.close();
	}
}
