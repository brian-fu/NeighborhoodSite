package Server.server;

import java.net.ServerSocket;
import java.net.Socket;

class Server{
    public static void main(String[] args) {
		new Server().runServer();
	}

	private void runServer() {
		try {
			setUpNetworking();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private void setUpNetworking() throws Exception {
		@SuppressWarnings("resource")
		ServerSocket serverSock = new ServerSocket(2232);
		while (true) {
			Socket clientSocket = serverSock.accept();
			System.out.println("Got a connection to " + clientSocket);

			// ClientHandler handler = new ClientHandler(this, clientSocket, uniqueID++);
			// this.addObserver(handler);
			
			// updateClients("0 0 Initialized", "1 0 " + getJsonArray().toString(), "2 0 Initialized");

			// Thread t = new Thread(handler);
			// t.start();
		}
	}
}