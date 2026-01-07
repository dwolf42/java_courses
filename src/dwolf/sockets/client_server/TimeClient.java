package dwolf.sockets.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {
	public static void main(String[] args) {
		// Client connects to the localhost or any other IP
		try (Socket socketToServer = new Socket("localhost", 4711)) {
			// Prints the sever's IP address if connection is established
			System.out.println("Verbunden mit " + socketToServer.getInetAddress());

			// Get me the nice and juicy input stream from the server!
			InputStream inputStreamFromServer = socketToServer.getInputStream();
			// BufferedReader uses InputStream to translate the byte-stream
			// coming from inputStreamFromServer to a char-stream
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamFromServer));

			// Read the time information and assign it to a string
			String zeit = bufferedReader.readLine();
			System.out.println("Server meldet: " + zeit);

			// Close your resources!
			bufferedReader.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
