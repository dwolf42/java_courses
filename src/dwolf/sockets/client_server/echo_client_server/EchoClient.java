package dwolf.sockets.client_server.echo_client_server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// Based on: https://hyperskill.org/learn/step/4942

public class EchoClient {
	private static final String SERVER_ADDRESS = "127.0.0.1";
	private static final int SERVER_PORT = 34522;
	private static Socket socket;
	private static BufferedReader input;
	private static PrintWriter output;
	private static Scanner scanner;

	public static void main(String[] args) throws IOException {
		while (true) {
			try {
				socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
				input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				output = new PrintWriter(socket.getOutputStream(), true);
				scanner = new Scanner(System.in);
			} catch (IOException e) {
				socket.close();
				input.close();
				output.close();
				e.printStackTrace();
			}
			String msg = scanner.nextLine();
			output.println(msg);
			String receivedMsg = input.readLine();
			System.out.println("Received from the server: " + receivedMsg);
		}
	}
}
