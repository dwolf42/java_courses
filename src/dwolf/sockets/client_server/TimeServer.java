package dwolf.sockets.client_server;

import java.io.*;
import java.net.*;
import java.time.*;

public class TimeServer {
	public static void main(String[] args) {
		// Create object of class ServerSocket for to listen to requests on port 4711
		try (ServerSocket server = new ServerSocket(4711)) {
			while (true) {
				System.out.println("Warten auf Client...");
				// The method accept() waits until a client wishes to establish a connection,
				// and then provides a Socket-Object for the communication with the client
				Socket client = server.accept();
				System.out.println("Mit Client " + client.getInetAddress() + " verbunden");
				// Get OutputStream from the new socket to the client
				OutputStream outputStreamToClient = client.getOutputStream();

				// Put PrintWriter onto the OutputStream 'outputStreamToClient'
				// in order to trasfer text
				PrintWriter writer = new PrintWriter(outputStreamToClient);

				// Get current time
				LocalTime time = LocalTime.now();

				// Send time as string (with EoL!!)
				writer.println(time.toString());

				// Close PritWriter (with all including streams/sockets).
				// This also empties and sends the writing buffer!!
				writer.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
