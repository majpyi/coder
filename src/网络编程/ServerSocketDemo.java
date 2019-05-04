package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Mr.M
 * @Date: 2019-04-07 17:08
 * @Description:
 **/
public class ServerSocketDemo {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("等待");
		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String info = null;
		while ((info = bufferedReader.readLine()) != null) {
			System.out.println("server" + info);
		}

		socket.shutdownInput();

		OutputStream outputStream =socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		printWriter.write("welcome");
		printWriter.flush();

		printWriter.close();
		outputStream.close();

		bufferedReader.close();
		inputStreamReader.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}
}
