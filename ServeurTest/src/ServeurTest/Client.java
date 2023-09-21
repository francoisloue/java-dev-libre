package ServeurTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverAddress = "localhost";
        
        int serverPort = 12345;
        
        try {
            Socket socket = new Socket(serverAddress,serverPort);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            
            out.println("Hello serveur");
            
            String response;
            
            while((response=in.readLine())!=null) {
                System.out.println(response);
            }
            
            in.close();
            out.close();
            socket.close();
        }catch(IOException e) {
            System.out.println("error: "+e);
        }
    }
}
