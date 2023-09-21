package ServeurTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main(String[] args) {
int port = 12345;
        
        try {
            ServerSocket serverSocket = new ServerSocket();
            System.out.println("Wainting for connexion");
            
            Socket clientSocket = serverSocket.accept();
            
            BufferedReader  in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
            
            String message;
            while((message = in.readLine())!=null) {
                System.out.println("Client " + message);
                out.println("Serveur message recu " + message);
            }
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        }catch(IOException e) {
            System.out.println("Error : " + e);
        }
	}
}
