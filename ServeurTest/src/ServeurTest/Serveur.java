package ServeurTest;

import java.net.ServerSocket;

public class Serveur {
	public static void main(String[] args) {
		int port = 12345;
		
		try{
			ServerSocket serverSocket = new ServerSocket(port);
			
		} catch(Exception e) {
			System.out.println("Error occured -> : "+e);
		}
	}
}
