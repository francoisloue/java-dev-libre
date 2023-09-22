package RemoteFunction;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {

	protected CalculatorServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CalculatorServer server = new CalculatorServer();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("CalculatriceService", server);
			System.out.println("Serveur RMI prêt(e) (on est inclusif ici, c'est 2023 mon gars, faut évolué (tri tes dechets et coupe le WIFI aussi))");
		} catch(Exception e) {
			System.err.println("error occured in CalculatorServer : "+e);
			e.printStackTrace();
		}
	}

}
