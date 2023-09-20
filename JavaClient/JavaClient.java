package JavaClient;

import java.net.Socket;

public class JavaClient {

    private static String host = "198.168.10.1";

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
		Socket socket = new Socket(host, 8080);
		System.out.println("Connecting to... " + socket);
    }
}
