package dwolf.sockets.client_server.echo_client_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int PORT = 34522;
	private static ServerSocket server;

	public static void main(String[] args) throws IOException {
		try {
			server = new ServerSocket(PORT);
			while (true) {
				Session session = new Session(server.accept());
				session.start(); // does not block this server thread
			}
		} catch (IOException e) {
			e.printStackTrace();
			server.close();
		}
	}
}

class Session extends Thread {
	private static Socket socket;
	private static BufferedReader input;
	private static PrintWriter output;

	public Session(Socket socketForClient) {
		this.socket = socketForClient;
	}

	public void run() {

		while (true) {
			try {
				input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				output = new PrintWriter(socket.getOutputStream(), true);
			} catch (IOException e) {
				try {
					socket.close();
					input.close();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				output.close();
				e.printStackTrace();
			}
			String msg = null;
			try {
				msg = input.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			output.println(msg);
		}
	}
}
