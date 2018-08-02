package com.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 3336);
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.print("输入消息：");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		in.close();
		dos.writeUTF(word);
		dos.close();
		socket.close();
	}
}
