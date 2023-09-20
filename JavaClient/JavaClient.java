package JavaClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class JavaClient {

    // private static String host = "198.168.10.1";
    private static String host = "11.207.2.30";
    private BufferedReader fromServer;
	private PrintWriter toServer;

    public static void main(String[] args) {
        try{
            JavaClient c = new JavaClient();
            c.setUpNetworking();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void setUpNetworking() throws Exception {
		@SuppressWarnings("resource")
		Socket socket = new Socket(host, 2232);
		System.out.println("Connecting to... " + socket);
        fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		toServer = new PrintWriter(socket.getOutputStream());

        String message = "POST aaa";
        toServer.println(message);
        toServer.flush();
        String serverResponse = fromServer.readLine();
        System.out.println("Server response: " + serverResponse);
    }
}
